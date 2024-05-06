package com.quiz.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.entities.Persona;

@Service
public interface PersonaService {

	List<Persona> getPersone();
	Persona getPersonaById(int id);
}
