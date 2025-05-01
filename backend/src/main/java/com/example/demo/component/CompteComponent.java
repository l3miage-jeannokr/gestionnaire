package com.example.demo.component;

import com.example.demo.exceptions.technicals.NotFoundCompteEntityException;
import com.example.demo.models.CompteEntity;
import com.example.demo.repository.CompteRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CompteComponent {
    private CompteRepository compteRepository;

    public CompteEntity getCompte(String compte) throws NotFoundCompteEntityException {
        return compteRepository.findById(compte).orElseThrow(() -> new NotFoundCompteEntityException(String.format("compte %s non trouve", compte)));
    }

    public List<CompteEntity> getAllComptes() {
        return compteRepository.findAll();
    }

    public CompteEntity updateCompte(CompteEntity compte) {
        return compteRepository.save(compte);
    }
    public CompteEntity createCompte(CompteEntity compte) {
        return compteRepository.save(compte);
    }
}
