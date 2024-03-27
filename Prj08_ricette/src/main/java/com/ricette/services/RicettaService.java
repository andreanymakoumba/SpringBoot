package com.ricette.services;

import java.util.List;

import com.ricette.entities.Ricetta;

public interface RicettaService {
	
	List<Ricetta> getRicette();
	List<Ricetta> getRicetteByIngredienti(String ingredienti);
	
	Ricetta getRicettaById(int id);
	Ricetta updateRicetta(Ricetta r);
	Ricetta addRicetta(Ricetta r);
	void deleteRicetta(Ricetta r);
}
