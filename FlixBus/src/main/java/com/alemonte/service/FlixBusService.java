package com.alemonte.service;

import java.util.List;

import com.alemonte.entities.Dipendente;
import com.alemonte.entities.Prenotazione;
import com.alemonte.entities.Utente;
import com.alemonte.entities.Viaggio;

public interface FlixBusService {
	List<Utente> getUtenti();
	Utente addUtente(Utente u);
	
	
	
	List<Prenotazione> getPrenotazioni();
	Prenotazione addPrenotazione(Prenotazione p);
	
	
	List<Viaggio> getViaggi();
	Viaggio addViaggio(Viaggio v);
	
	List<Dipendente> getDipendeti();
	Dipendente addDipendente(Dipendente d);
}
