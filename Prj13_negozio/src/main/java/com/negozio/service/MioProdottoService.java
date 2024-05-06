package com.negozio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.negozio.entities.MioProdotto;
import com.negozio.entities.Products;
import com.negozio.repos.MioProdottoDao;

@Service
public class MioProdottoService {

	@Autowired
	private MioProdottoDao dao;
	
	@Autowired
	private MagazinoService service;
	
	public void caricaProdotti() {
		for (Products p: service.getProdotti()) {
			MioProdotto mp = new MioProdotto();
			mp.setTitle(p.getTitle());
			mp.setPrice(p.getPrice());
			dao.save(mp);
		}
	}
}
