package com.example.demo.domain.models.dtos;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataNascimento;
	
	private List<EnderecoRequestDto> enderecos;
}
