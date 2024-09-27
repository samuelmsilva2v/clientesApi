package com.example.demo.domain.models.dtos;

import java.util.UUID;

import lombok.Data;

@Data
public class EnderecoResponseDto {

	private UUID id;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
}
