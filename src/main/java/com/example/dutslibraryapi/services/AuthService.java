package com.example.dutslibraryapi.services;


import com.example.dutslibraryapi.dto.person.PersonInfoDTO;
import com.example.dutslibraryapi.dto.person.PersonLoginDTO;
import com.example.dutslibraryapi.exceptions.PersonNotFoundException;
import com.example.dutslibraryapi.models.Person;
import com.example.dutslibraryapi.util.validation.PersonValidator;
import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthService {

    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final PeopleService peopleService;

    private final PersonValidator personValidator;

    public AuthService(PasswordEncoder passwordEncoder, AuthenticationManager authenticationManager, PeopleService peopleService, PersonValidator personValidator) {
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
        this.peopleService = peopleService;
        this.personValidator = personValidator;
    }


    @Transactional
    public Person register(Person person) {

        personValidator.registerValidate(person);
        person.setPassword(passwordEncoder.encode(person.getPassword()));

        if (person.getRole() == null) {
            person.setRole("ROLE_USER");
        }
        peopleService.save(person);

        return person;
    }

    public Person login(Person loggedPerson) {
        personValidator.loginValidate(loggedPerson);

        Person person = peopleService.findByEmail(loggedPerson.getEmail()).orElseThrow(() -> new PersonNotFoundException("User with this email not found!"));

        UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(
                loggedPerson.getEmail(), loggedPerson.getPassword());
        authenticationManager.authenticate(authRequest);

//        System.out.println(loggedPerson.getEmail() + " " + loggedPerson.getPassword());
        return person;
    }


}
