package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("/hello")
public class HelloController {
	@GetMapping
	public String hello() {
		return "Hello World";
	}
		@GetMapping("/bsm")
		public String bsm() {
			return "Comunicação <br /> Persistência <br /> Mentalidade de Crescimento <br /> Responsabilidade Pessoal <br /> Orientação ao Futuro <br /> Proatividade <br /> Orientação ao Detalhe <br /> Trabalho em Equipe  ";
	}
		@GetMapping("/objetivo")
		public String objetivo() {
			return "Meu maior objetivo é além de absorver o conteúdo, é consiguir aplicar nos projetos sem ter nenhuma dificuldade.";
	}
		}
