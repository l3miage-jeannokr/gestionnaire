package com.example.demo.repository;


import com.example.demo.models.CompteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<CompteEntity, String> {

}
