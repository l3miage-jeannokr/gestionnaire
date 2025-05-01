package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.lang.NonNull;

@Entity
public class CompteEntity {
    @Id
    private String identifiant;

    @NonNull
    private String compte;
    @NonNull
    private String motdepasse;

    private String description;
}
