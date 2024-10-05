package com.eshop.OrderService.exception;

public class ObjectAlreadyExistsException extends RuntimeException{

    public ObjectAlreadyExistsException(String message) {
        super(message);
    }
}