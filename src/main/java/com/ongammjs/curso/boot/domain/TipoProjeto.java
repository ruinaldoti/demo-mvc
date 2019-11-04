package com.ongammjs.curso.boot.domain;


import java.util.*;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table (name = "TIPOPROJETOS")
public class TipoProjeto extends AbstractEntntity<Long> {

	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}


