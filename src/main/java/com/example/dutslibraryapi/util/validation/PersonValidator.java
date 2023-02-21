package com.example.dutslibraryapi.util.validation;


import com.example.dutslibraryapi.dto.person.IPersonRegistration;
import com.example.dutslibraryapi.dto.person.PersonDTO;
import com.example.dutslibraryapi.dto.person.PersonLoginDTO;
import com.example.dutslibraryapi.exceptions.PersonIsExistException;
import com.example.dutslibraryapi.exceptions.PersonNotFoundException;
import com.example.dutslibraryapi.models.Person;
import com.example.dutslibraryapi.services.PeopleService;
import org.springframework.stereotype.Component;

@Component
public class PersonValidator {

    private final PeopleService peopleService;

    public PersonValidator(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    public void validate(PersonDTO personDTO) {
        if (personDTO.getClass() == PersonLoginDTO.class && !peopleService.existsByEmail(personDTO.getEmail())) {
            throw new PersonNotFoundException("User with this email not found!");
        } else if ((personDTO instanceof IPersonRegistration) && peopleService.existsByEmail(personDTO.getEmail())) {
            throw new PersonIsExistException("Email should be uniq!");
        }
    }

    public void registerValidate(Person person) {
        if (peopleService.existsByEmail(person.getEmail())){
            throw new PersonIsExistException("Email should be uniq!");
        }
    }
    public void loginValidate(Person person){
        if(!peopleService.existsByEmail(person.getEmail())){
            throw new PersonNotFoundException("User with this email not found!");
        }
    }

}

//return peopleRepository.findByEmail(email).orElseThrow(() -> new PersonNotFoundException("Person not found"));
