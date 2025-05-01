package com.example.demo.exceptions.technicals;

public class NotFoundCompteEntityException extends RuntimeException {
    public NotFoundCompteEntityException(String message) {
        super(message);
    }
}
