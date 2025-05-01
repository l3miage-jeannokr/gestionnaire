package com.example.demo.services;

import com.example.demo.component.CompteComponent;
import com.example.demo.exceptions.rest.BadRequestRestException;
import com.example.demo.exceptions.technicals.NotFoundCompteEntityException;
import com.example.demo.mappers.CompteMapper;
import com.example.demo.models.CompteEntity;
import com.example.demo.request.CompteCreationRequest;
import com.example.demo.responses.CompteResponseDTO;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompteService {
    private final CompteComponent compteComponent;
    private final CompteMapper compteMapper;

    public CompteResponseDTO getCompte(String compte) {
        try {
            return compteMapper.toResponse(compteComponent.getCompte(compte));
        } catch (NotFoundCompteEntityException e){
            throw new NotFoundCompteEntityException(e.getMessage());
        }
    }


    public List<CompteResponseDTO> getAllCompte() {
        List<CompteEntity> comptes = compteComponent.getAllComptes();
        return compteMapper.toResponse(comptes);
    }

    public CompteResponseDTO createCompte(CompteCreationRequest request) {
        try {
            CompteEntity compte = compteMapper.toEntity(request);
            return compteMapper.toResponse(compteComponent.createCompte(compte));
        }catch (Exception e){
            //Attention à cette Erreur pas la bonne
            throw new NotFoundCompteEntityException(e.getMessage());
        }
    }

    public CompteResponseDTO updateCompte(String identifiant, String compte) {
        return null;
    }
}
