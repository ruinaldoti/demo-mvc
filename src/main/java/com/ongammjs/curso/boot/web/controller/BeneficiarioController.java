package com.ongammjs.curso.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("beneficiarios")
public class BeneficiarioController {
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/beneficiario/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/beneficiario/lista";
	}

}
