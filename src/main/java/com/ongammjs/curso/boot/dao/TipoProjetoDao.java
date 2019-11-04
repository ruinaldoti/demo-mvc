package com.ongammjs.curso.boot.dao;


import java.util.List;

import com.ongammjs.curso.boot.domain.TipoProjeto;



public interface TipoProjetoDao {
	
	void salvar(TipoProjeto tipo_projeto);

    void update(TipoProjeto tipo_projeto);

    void delete(Long id);

    TipoProjeto findById(Long id);

    List<TipoProjeto> findAll();

}

