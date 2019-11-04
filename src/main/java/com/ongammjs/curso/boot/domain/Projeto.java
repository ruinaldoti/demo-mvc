package com.ongammjs.curso.boot.domain;


import javax.persistence.*;

@Entity
@Table (name = "PROJETO")
public class Projeto extends AbstractEntntity<Long> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "id_tipo_projeto_fk")
	private TipoProjeto tipo_projeto;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoProjeto getTipo_projeto() {
		return tipo_projeto;
	}

	public void setTipo_projeto(TipoProjeto tipo_projeto) {
		this.tipo_projeto = tipo_projeto;
	}

	
}


