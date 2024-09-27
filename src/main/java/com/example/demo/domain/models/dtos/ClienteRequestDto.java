package com.example.demo.domain.models.dtos;

import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class ClienteRequestDto {

	@NotBlank(message = "O nome é obrigatório.")
	private String nome;
	
	@NotBlank(message = "O e-mail é obrigatório.")
	@Email
	private String email;
	
	@NotBlank(message = "O CPF é obrigatório.")
	@Pattern(regexp = "\\d{11}")
	private String cpf;
	
	@NotNull(message = "A data de nascimento é obrigatória.")
	private Date dataNascimento;
	
	private List<EnderecoRequestDto> enderecos;
}
