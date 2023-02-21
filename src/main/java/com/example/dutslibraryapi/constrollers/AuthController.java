package com.example.dutslibraryapi.constrollers;


import com.example.dutslibraryapi.dto.person.PersonInfoDTO;
import com.example.dutslibraryapi.dto.person.PersonLoginDTO;
import com.example.dutslibraryapi.dto.person.PersonRegistrationDTO;
import com.example.dutslibraryapi.models.Person;
import com.example.dutslibraryapi.security.JWTUtil;
import com.example.dutslibraryapi.services.AuthService;
import com.example.dutslibraryapi.services.UserMapperService;
import com.example.dutslibraryapi.util.validation.PersonValidator;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@RestController
@RequestMapping("auth")
public class AuthController {

    private final AuthService registrationService;
    private final UserMapperService userMapperService;
    private final JWTUtil jwt;

    public AuthController(AuthService registrationService, UserMapperService userMapperService, JWTUtil jwt) {
        this.registrationService = registrationService;
        this.userMapperService = userMapperService;
        this.jwt = jwt;
    }

    @PostMapping("/login")
    public PersonInfoDTO performLogin(@RequestBody @Valid PersonLoginDTO personLoginDTO) {
        Person person = userMapperService.convertPersonDTOToPerson(personLoginDTO);
        PersonInfoDTO response = userMapperService.convertToPersonInfoDTO(registrationService.login(person));

        System.out.println(response.getEmail() + " " + response.getUsername());

        String token = jwt.generateToken(person.getEmail());
        response.setJwtToken(token);

        return response;
    }

    @PostMapping("/registration")
    public PersonInfoDTO performRegistration(@RequestBody @Valid PersonRegistrationDTO personRegistrationDTO) {
        Person person = userMapperService.convertPersonDTOToPerson(personRegistrationDTO);
        return userMapperService.convertToPersonInfoDTO(registrationService.register(person));
    }
}
