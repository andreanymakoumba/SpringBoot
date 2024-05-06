package com.quiz.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.entities.DomandaTest;


@Service
public interface DomandaTestService {

	List<DomandaTest> getDomandeTest();
	DomandaTest getDomandaById(int id);
	DomandaTest addDomanda(DomandaTest dt);
	DomandaTest updateDomanda(DomandaTest dt);
	void deleteDomanda(DomandaTest dt);
}
