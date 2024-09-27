package com.example.demo.application.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.models.dtos.ClienteRequestDto;
import com.example.demo.domain.models.dtos.ClienteResponseDto;
import com.example.demo.domain.service.interfaces.ClienteDomainService;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteDomainService clienteDomainService;

	@PostMapping
	public ClienteResponseDto post(@RequestBody ClienteRequestDto request) throws Exception {
		return clienteDomainService.inserir(request);
	}
	
	@PutMapping("{id}")
	public ClienteResponseDto put(@RequestBody ClienteRequestDto request, @PathVariable UUID id) throws Exception {
		return clienteDomainService.atualizar(id, request);
	}
	
	@DeleteMapping("{id}")
	public ClienteResponseDto delete(@PathVariable UUID id) throws Exception {
		// TODO
		return null;
	}
	
	@GetMapping
	public List<ClienteResponseDto> getAll() throws Exception {
		// TODO
		return null;
	}
	
	@GetMapping("{id}")
	public ClienteResponseDto getById(@PathVariable UUID id) throws Exception {
		// TODO
		return null;
	}
}
