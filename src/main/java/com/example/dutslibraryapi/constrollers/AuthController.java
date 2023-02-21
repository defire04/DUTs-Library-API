package com.example.dutslibraryapi.constrollers;


import com.example.dutslibraryapi.dto.person.PersonInfoDTO;
import com.example.dutslibraryapi.dto.person.PersonLoginDTO;
import com.example.dutslibraryapi.dto.person.PersonRegistrationDTO;
import com.example.dutslibraryapi.security.JWTUtil;
import com.example.dutslibraryapi.services.AuthService;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@RestController
@RequestMapping("auth")
public class AuthController {

    private final AuthService registrationService;
    private final JWTUtil jwt;

    public AuthController(AuthService registrationService, JWTUtil jwt) {
        this.registrationService = registrationService;
        this.jwt = jwt;
    }

    @PostMapping("/login")
    public PersonInfoDTO loginPage(@RequestBody @Valid PersonLoginDTO personLoginDTO) {
        String token = jwt.generateToken(personLoginDTO.getEmail());
        PersonInfoDTO response = registrationService.login(personLoginDTO);
        response.setJwtToken(token);
        return response;
    }

    @PostMapping("/registration")
    public PersonInfoDTO performRegistration(@RequestBody @Valid PersonRegistrationDTO personRegistrationDTO) {
        String token = jwt.generateToken(personRegistrationDTO.getEmail());
        PersonInfoDTO response = registrationService.register(personRegistrationDTO);
        response.setJwtToken(token);
        return response;
    }
}
