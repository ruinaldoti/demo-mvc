package com.ongammjs.curso.boot.services;

import java.util.List;


import com.ongammjs.curso.boot.domain.TipoProjeto;

public interface TipoProjetoService {

	void salvar (TipoProjeto tipo_projeto);
		
	void editar (TipoProjeto tipo_projeto);
	
	void excluir (Long id);
	
	TipoProjeto buscarPorId(Long id);
	
	List<TipoProjeto> buscaTodos();

}


