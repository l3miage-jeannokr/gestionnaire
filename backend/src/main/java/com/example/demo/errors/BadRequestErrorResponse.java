package com.example.demo.errors;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class BadRequestErrorResponse {
    @Schema(description ="end point call", example = "api/adresse")
    private String uri;
    @Schema (description ="error message", example = "la requete est mauvaise")
    private String errorMessage;
    public BadRequestErrorResponse(String uri, String errorMessage) {
        this.uri = uri;
        this.errorMessage = errorMessage;
    }
}