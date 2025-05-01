package com.example.demo.exceptions.rest;

public class BadRequestRestException extends Throwable {
    public BadRequestRestException(String message) {
        super(message);
    }
}
