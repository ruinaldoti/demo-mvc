package com.ongammjs.curso.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ongammjs.curso.boot.dao.ProjetoDao;
import com.ongammjs.curso.boot.domain.Projeto;

@Service @Transactional(readOnly = false)
public class ProjetoServiceImp  implements ProjetoService {

	@Autowired
	private ProjetoDao dao;
	
	
	@Transactional(readOnly = false)
	@Override
	public void salvar(Projeto projeto) {
		dao.salvar(projeto);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Projeto projeto) {
		dao.update(projeto);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Transactional(readOnly = false)
	@Override
	public Projeto buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Transactional(readOnly = false)
	@Override
	public List<Projeto> buscaTodos() {
		
		return dao.findAll();
	}
	
	

}



