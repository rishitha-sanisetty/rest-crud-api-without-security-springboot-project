package com.springboot.rest.api.exceptionhandling;

public class NoSuchObjectExistsExceptionHandler extends RuntimeException {

    public NoSuchObjectExistsExceptionHandler(String resourceName, String fieldName, Object fieldValue) {
        super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
    }

}
