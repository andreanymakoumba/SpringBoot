package com.quiz.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.entities.Domanda;


@Service
public interface DomandaService {

	List<Domanda> getDomande();
	Domanda getDomandaById(int id);
	Domanda addDomanda(Domanda d);
	Domanda updateDomanda(Domanda d);
	void deleteDomanda(Domanda d);
}
