package com.example.dutslibraryapi.config;


import com.example.dutslibraryapi.dto.responce.ErrorDTO;
import com.example.dutslibraryapi.exceptions.PersonIsExistException;
import com.example.dutslibraryapi.exceptions.PersonNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.*;

//@RestControllerAdvice
//public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
//
//    @ExceptionHandler({
//            PersonNotFoundException.class,
//            PersonIsExistException.class
//    })
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    protected ErrorDTO handleConflict(RuntimeException ex) {
//        return new ErrorDTO(Collections.singletonList(ex.getMessage()), ex.getClass().getSimpleName());
//    }
//
//    @Override
//    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
//        return super.handleMethodArgumentNotValid(ex, headers, status, request);
//    }
//}


@RestControllerAdvice
public class RestResponseEntityExceptionHandler {

    @ExceptionHandler({
            PersonNotFoundException.class,
            PersonIsExistException.class
    })
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    protected ErrorDTO handleConflict(RuntimeException ex) {
        return new ErrorDTO(ex.getClass().getSimpleName(), ex.getMessage());
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public List<ErrorDTO> handleMethodArgumentException(MethodArgumentNotValidException exception) {
        List<ErrorDTO> errors = new ArrayList<>();

        exception.getBindingResult().getFieldErrors().forEach(error -> {
            errors.add(new ErrorDTO(error.getClass().getSimpleName(), error.getDefaultMessage()));
        });


        return errors;
    }
}
