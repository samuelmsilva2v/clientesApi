package com.example.demo.domain.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.models.dtos.ClienteRequestDto;
import com.example.demo.domain.models.dtos.ClienteResponseDto;
import com.example.demo.domain.models.dtos.EnderecoRequestDto;
import com.example.demo.domain.models.entities.Cliente;
import com.example.demo.domain.models.entities.Endereco;
import com.example.demo.domain.service.interfaces.ClienteDomainService;
import com.example.demo.infrastructure.repositories.ClienteRepository;

@Service
public class ClienteDomainServiceImpl implements ClienteDomainService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ClienteResponseDto inserir(ClienteRequestDto request) throws Exception {

		Cliente cliente = modelMapper.map(request, Cliente.class);
		cliente.setId(UUID.randomUUID());

		List<Endereco> enderecos = new ArrayList<Endereco>();

		for (EnderecoRequestDto enderecoRequest : request.getEnderecos()) {
			Endereco endereco = modelMapper.map(enderecoRequest, Endereco.class);
			endereco.setId(UUID.randomUUID());

			endereco.setCliente(cliente);

			enderecos.add(endereco);
		}

		cliente.setEnderecos(enderecos);

		clienteRepository.save(cliente);

		ClienteResponseDto response = modelMapper.map(cliente, ClienteResponseDto.class);

		return response;
	}

	@Override
	public ClienteResponseDto atualizar(UUID id, ClienteRequestDto request) throws Exception {

		Cliente cliente = clienteRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado. Verifique o ID informado."));
		
		// TODO

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
