package com.magazino.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mgazino.entities.Movimento;
import com.mgazino.entities.Prodotto;

public interface MagazinoService {

	@Service
	public interface MagazzinoService {

		List<Prodotto> getProdotti();
		
		Prodotto getProdottoById(int id);
		Prodotto updateProdotto(Prodotto p);
		Prodotto addProdotto(Prodotto p);
		void deleteProdotto(Prodotto p);
		

		List<Movimento> getMovimenti();
		
		Movimento getMovimentoById(int id);
		Movimento updateMovimento(Movimento m);
		Movimento addMovimento(Movimento m);
		void deleteMovimento(Movimento m);

	}


}
