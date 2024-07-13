package com.springboot.rest.api.exceptionhandling;

public class ObjectAlreadyExistsExceptionHandler extends RuntimeException {

    public ObjectAlreadyExistsExceptionHandler(String message) {
        super(String.format("%s'", message));
    }

}