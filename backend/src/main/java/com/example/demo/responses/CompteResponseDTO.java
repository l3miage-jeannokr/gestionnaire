package com.example.demo.responses;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

@Schema(description = "Format de reponse pour un compte")
public class CompteResponseDTO {
    @Schema(description = "identifiant du compte", example = "123456789")
    private String identifiant;
    @Schema(description = "compte", example = "123456789")
    private String compte;
    @Schema(description = "mot de passe", example = "<PASSWORD>")
    private String motdepasse;
}
