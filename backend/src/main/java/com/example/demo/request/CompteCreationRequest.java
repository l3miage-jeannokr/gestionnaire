package com.example.demo.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Schema(description = "Format de requête pour ajouté un compte")
@Builder
public record CompteCreationRequest (
    @Schema(description = "identifiant du compte", example = "123456789")
    String identifiant,
    @Schema(description = "compte", example = "123456789")
    String compte,
    @Schema(description = "mot de passe", example = "<PASSWORD>")
    String motdepasse
    ){}
