package com.example.demo.endpoints;

import com.example.demo.request.CompteCreationRequest;
import com.example.demo.responses.CompteResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/comptes")
@Tag(description = "Les comptes associer", name = "Comptes")
public interface CompteEndpoints {

    @Operation(description = "retourner tout les comptes associer")
    @ApiResponse(responseCode = "200", description = "Liste des comptes")
    @ApiResponse(responseCode = "400", description = "Il n'y as pas de compte associer")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/all")
    List<CompteResponseDTO> getAllCompte();

    @Operation(description = "retourner tout les comptes associer")
    @ApiResponse(responseCode = "200", description = "Liste des comptes")
    @ApiResponse(responseCode = "400", description = "Il n'y as pas de compte associer")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{compte}")
    CompteResponseDTO getCompte(@PathVariable String compte);
    

    @Operation(description = "ajouter un compte")
    @ApiResponse(responseCode = "200", description = "le compte à été ajouté")
    @ApiResponse(responseCode = "400", description = "Le compte n'as pas été ajouté")
    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(value = "/create")
    CompteResponseDTO createCompte(@RequestBody CompteCreationRequest request);

    @Operation(description = "update un comptes")
    @ApiResponse(responseCode = "200", description = "Le comptes à été ajouté")
    @ApiResponse(responseCode = "400", description = "Il n'y as pas de compte associer")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{identifiant},{compte}")
    CompteResponseDTO updateCompte(@PathVariable String identifiant, @PathVariable String compte);
}
