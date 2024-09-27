package com.example.demo.domain.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.demo.domain.models.dtos.ClienteRequestDto;
import com.example.demo.domain.models.dtos.ClienteResponseDto;
import com.example.demo.domain.service.interfaces.ClienteDomainService;

@Service
public class ClienteDomainServiceImpl implements ClienteDomainService {

	@Override
	public ClienteResponseDto inserir(ClienteRequestDto request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteResponseDto inserir(UUID id, ClienteRequestDto request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteResponseDto excluir(UUID id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClienteResponseDto> consultar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteResponseDto obterPorId(UUID id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
}
