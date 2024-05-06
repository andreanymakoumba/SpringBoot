package com.negozio.service;

import java.util.List;

import com.negozio.entities.Products;

public interface MagazinoService {

	
     Products[] getProdotti();
     
	 Products[] getProdotti(int id);
}
