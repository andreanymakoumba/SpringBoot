package com.quiz.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entities.Domanda;
import com.quiz.services.DomandaService;

@RestController
public class DomandaCtrl {

	@Autowired
	private DomandaService domandaService;
	
	@GetMapping("domande")
	public List<Domanda> getAll(){
		return domandaService.getDomande();
	}
	
}
