package com.ongammjs.curso.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("projetos")
public class ProjetosController {
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/projeto/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/projeto/lista";
	}

}
