package com.quiz.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entities.Persona;
import com.quiz.services.PersonaService;

@RestController
public class PersonaCtrl {

	@Autowired
	private PersonaService personaService;
	
	@GetMapping("persone")
	public List<Persona> getAll(){
		return personaService.getPersone();
	}
}
