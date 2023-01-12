package com.ifrr.projetosp4.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "empresas")
public class EmpresaBean {
	
	@Id
	@Column(name = "codigo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cnpj")
	private String cnpj;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "endereco")
	private String endereco;
	
	@Column(name = "email")
	private String email;	
}