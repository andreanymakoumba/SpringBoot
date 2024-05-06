package com.quiz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.quiz.entities.Persona;
import com.quiz.repos.PersonaDao;
;

@Service
public class PersonaServiceImpl implements PersonaService{

	@Autowired
	private PersonaDao personaDao;

	@Override
	public List<Persona> getPersone() {
		
		return personaDao.findAll();
	}

	@Override
	public Persona getPersonaById(int id) {
		
		return personaDao.findById(id).get();
	}

	
}
