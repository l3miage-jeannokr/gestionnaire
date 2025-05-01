package com.example.demo.mappers;

import com.example.demo.models.CompteEntity;
import com.example.demo.request.CompteCreationRequest;
import com.example.demo.responses.CompteResponseDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CompteMapper {
    CompteEntity toEntity(CompteCreationRequest request);
    CompteResponseDTO toResponse(CompteEntity entity);

    List<CompteResponseDTO> toResponse(List<CompteEntity> entities);
}
