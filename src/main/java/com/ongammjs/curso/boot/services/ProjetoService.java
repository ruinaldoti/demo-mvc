package com.ongammjs.curso.boot.services;


import java.util.List;

import com.ongammjs.curso.boot.domain.Projeto;

public interface ProjetoService {
	
	void salvar (Projeto projeto);
	
	
	void editar (Projeto projeto);
	
	void excluir (Long id);
	
	Projeto buscarPorId(Long id);
	
	List<Projeto> buscaTodos();

}

