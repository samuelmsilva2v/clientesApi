package com.example.demo.domain.models.dtos;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ClienteResponseDto {
	
	private UUID id;
	private String nome;
	private String email;
	private String cpf;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataNascimento;
	
	private List<EnderecoResponseDto> enderecos;
}
