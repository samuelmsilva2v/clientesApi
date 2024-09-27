package com.example.demo.domain.models.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EnderecoRequestDto {

	@NotBlank(message = "O logradouro é obrigatório.")
	private String logradouro;
	
	@NotBlank(message = "O número é obrigatório.")
	private String numero;
	
	@NotBlank(message = "O complemento é obrigatório.")
	private String complemento;
	
	@NotBlank(message = "O bairro é obrigatório.")
	private String bairro;
	
	@NotBlank(message = "A cidade é obrigatória.")
	private String cidade;
	
	@NotBlank(message = "A unidade federal é obrigatória.")
	private String uf;
	
	@NotBlank(message = "O CEP é obrigatório.")
	private String cep;
}
