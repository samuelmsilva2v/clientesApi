package com.example.demo.domain.models.dtos;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import lombok.Data;

@Data
public class ClienteResponseDto {
	
	private UUID id;
	private String nome;
	private String email;
	private String cpf;
	private Date dataNascimento;
	private List<EnderecoResponseDto> enderecos;
}
