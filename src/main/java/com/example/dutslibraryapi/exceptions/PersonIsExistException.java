package com.example.dutslibraryapi.exceptions;

public class PersonIsExistException extends RuntimeException {
    public PersonIsExistException(String message) {
        super(message);
    }
}
