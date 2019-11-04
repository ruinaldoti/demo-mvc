package com.ongammjs.curso.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("socios")
public class SocioController {
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/socio/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/socio/lista";
	}


}
