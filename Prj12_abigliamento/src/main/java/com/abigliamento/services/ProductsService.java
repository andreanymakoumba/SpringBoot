package com.abigliamento.services;

import java.util.List;

import com.abigliamento.entities.Prodotto;

public interface ProductsService {

	
	 List<Prodotto> getProdotti();
	 Prodotto getProdotto(int id);
}
