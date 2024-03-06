package com.makoumba.services;

import java.util.List;

import com.makoumba.Gioco;

public interface GiocoService {

	List<Gioco> getGiochi();
	void addGioco(Gioco g);
}
