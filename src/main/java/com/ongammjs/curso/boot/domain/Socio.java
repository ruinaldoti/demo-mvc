package com.ongammjs.curso.boot.domain;

/*
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="SOCIO")
public class Socio extends AbstractEntntity<Long>{
	
	@Column(nullable = false, unique = true)
	private String nome;
	
	@Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
	private BigDecimal doacao;
	
	@Column(name = "data_adesao", nullable = false, columnDefinition = "DATE")
	private LocalDate dataAdesao;
	
	@Column(name = "data_cancelamento",  columnDefinition = "DATE")
	private LocalDate dataCancelamneto;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id_fk")
	private Endereco endereco;

	
	@OneToMany(mappedBy = "beneficiario") 
	private List<Beneficiario> beneficiario;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getDoacao() {
		return doacao;
	}

	public void setDoacao(BigDecimal doacao) {
		this.doacao = doacao;
	}

	public LocalDate getDataAdesao() {
		return dataAdesao;
	}

	public void setDataAdesao(LocalDate dataAdesao) {
		this.dataAdesao = dataAdesao;
	}

	public LocalDate getDataCancelamneto() {
		return dataCancelamneto;
	}

	public void setDataCancelamneto(LocalDate dataCancelamneto) {
		this.dataCancelamneto = dataCancelamneto;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	/*
	public List<Beneficiario> getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(List<Beneficiario> beneficiario) {
		this.beneficiario = beneficiario;
	}
	
	

	
}

*/
