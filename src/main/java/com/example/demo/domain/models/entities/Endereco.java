package com.example.demo.domain.models.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "endereco")
@Data
public class Endereco {

	@Id
	@Column(name = "id")
	private UUID id;

	@Column(length = 100, nullable = false)
	private String logradouro;

	@Column(length = 100, nullable = false)
	private String numero;

	@Column(length = 100, nullable = false)
	private String complemento;

	@Column(length = 100, nullable = false)
	private String bairro;

	@Column(length = 100, nullable = false)
	private String cidade;

	@Column(length = 2, nullable = false)
	private String uf;

	@Column(length = 8, nullable = false)
	private String cep;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id", nullable = false)
	private Cliente cliente;
}
