package com.example.demo.domain.models.entities;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "cliente")
@Data
public class Cliente {

	@Id
	private UUID id;
	
	@Column(length = 150, nullable = false)
	private String nome;
	
	
	@Column(length = 100, nullable = false)
	private String email;
	
	@Column(length = 11, nullable = false)
	private String cpf;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date dataNascimento;
	
	 @OneToMany(cascade = CascadeType.ALL)
	 private List<Endereco> enderecos;
}
