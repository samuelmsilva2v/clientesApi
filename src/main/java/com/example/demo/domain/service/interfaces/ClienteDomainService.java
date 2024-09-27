package com.example.demo.domain.service.interfaces;

import java.util.List;
import java.util.UUID;

import com.example.demo.domain.models.dtos.ClienteRequestDto;
import com.example.demo.domain.models.dtos.ClienteResponseDto;

public interface ClienteDomainService {

	public ClienteResponseDto inserir(ClienteRequestDto request) throws Exception;
	
	public ClienteResponseDto inserir(UUID id, ClienteRequestDto request) throws Exception;
	
	public ClienteResponseDto excluir(UUID id) throws Exception;
	
	public List<ClienteResponseDto> consultar() throws Exception;
	
	public ClienteResponseDto obterPorId(UUID id) throws Exception;
}
