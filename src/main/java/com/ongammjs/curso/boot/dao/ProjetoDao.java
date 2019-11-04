package com.ongammjs.curso.boot.dao;


import java.util.List;

import com.ongammjs.curso.boot.domain.Projeto;



public interface ProjetoDao {
	void salvar(Projeto projeto);

    void update(Projeto projeto);

    void delete(Long id);

    Projeto findById(Long id);

    List<Projeto> findAll();


}
