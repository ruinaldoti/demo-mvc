package com.ongammjs.curso.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ongammjs.curso.boot.dao.TipoProjetoDao;
import com.ongammjs.curso.boot.domain.TipoProjeto;



@Service  @Transactional(readOnly = false)
public class TipoProjetoServiceImp implements TipoProjetoService {

	@Autowired
	private TipoProjetoDao dao;

	@Transactional(readOnly = false)
	@Override
	public void salvar(TipoProjeto tipo_projeto) {
		dao.salvar(tipo_projeto);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(TipoProjeto tipo_projeto) {
		dao.update(tipo_projeto);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Transactional(readOnly = true)
	@Override 
	public TipoProjeto buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override 
	public List<TipoProjeto> buscaTodos() {
		
		return dao.findAll();
	}

}

