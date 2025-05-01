package com.example.demo.controllers;

import com.example.demo.endpoints.CompteEndpoints;
import com.example.demo.request.CompteCreationRequest;
import com.example.demo.responses.CompteResponseDTO;
import com.example.demo.services.CompteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CompteController implements CompteEndpoints {
    private final CompteService compteService;


    @Override
    public CompteResponseDTO getCompte(String compte) {
        return compteService.getCompte(compte);
    }

    @Override
    public List<CompteResponseDTO> getAllCompte(){
        return compteService.getAllCompte();
    }

    @Override
    public CompteResponseDTO createCompte(CompteCreationRequest request){
        return compteService.createCompte(request);
    }

    @Override
    public CompteResponseDTO updateCompte(String identifiant, String compte){
        return compteService.updateCompte(identifiant, compte);
    }
}
