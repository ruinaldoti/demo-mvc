package com.ongammjs.curso.boot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ongammjs.curso.boot.domain.TipoProjeto;
import com.ongammjs.curso.boot.services.TipoProjetoService;

@Controller
@RequestMapping("tipo_projetos")
public class TipoProjetoController {

	@Autowired
	private TipoProjetoService service;
	
	@GetMapping("/cadastrar")
	public String cadastrar(TipoProjeto tipoprojeto) {
		return "/tipo_projeto/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("tipo_projetos", service.buscaTodos());
		return "/tipo_projeto/lista";
	}
	
	
	@PostMapping("/salvar")
	public String salvar(TipoProjeto tipoprojeto) {
		service.salvar( tipoprojeto);
		return "redirect:/tipo_projetos/cadastrar";
		
	}
	
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		System.out.println("Teste");
		model.addAttribute("tipo_projeto", service.buscarPorId(id));
		return "/tipo_projeto/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(TipoProjeto tipoprojeto) {
		service.editar(tipoprojeto);
		return "redirect:/tipo_projetos/cadastrar";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		service.excluir(id);
		return listar(model);
		
	}
	
	
}
