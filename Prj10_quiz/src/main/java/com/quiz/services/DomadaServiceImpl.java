package com.quiz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entities.Domanda;
import com.quiz.repos.DomandaDao;

@Service
public class DomadaServiceImpl implements DomandaService{

	@Autowired
	private DomandaDao domandaDao;

	@Override
	public List<Domanda> getDomande() {
		return domandaDao.findAll();
	}

	@Override
	public Domanda getDomandaById(int id) {
		return domandaDao.findById(id).get();
	}

	@Override
	public Domanda addDomanda(Domanda d) {
		return domandaDao.save(d);
	}

	@Override
	public Domanda updateDomanda(Domanda d) {
		return domandaDao.save(d);
	}

	@Override
	public void deleteDomanda(Domanda d) {
		domandaDao.delete(d);
		
	}
}
