package com.example.demo.domain.service.interfaces;

import java.util.UUID;

import com.example.demo.domain.models.dtos.EnderecoRequestDto;
import com.example.demo.domain.models.dtos.EnderecoResponseDto;

public interface EnderecoDomainService {

	public EnderecoResponseDto atualizar(EnderecoRequestDto request, UUID id) throws Exception;
}
