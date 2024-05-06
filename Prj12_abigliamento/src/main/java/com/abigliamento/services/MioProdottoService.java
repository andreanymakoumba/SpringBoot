package com.abigliamento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abigliamento.entities.MioProdotto;
import com.abigliamento.entities.Prodotto;
import com.abigliamento.repos.MioProdottoDao;

@Service
public class MioProdottoService {

	@Autowired
	private MioProdottoDao dao;
	
	@Autowired
	private ProductsService service;
	
	public void caricaProdotti() {
		for (Prodotto p: service.getProdotti()) {
			MioProdotto mp = new MioProdotto();
			mp.setTitle(p.getTitle());
			mp.setPrice(p.getPrice());
			dao.save(mp);
		}
	}
}
