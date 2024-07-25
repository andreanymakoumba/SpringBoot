package com.alemonte.integretion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.alemonte.entities.Dipendente;
import com.alemonte.entities.Prenotazione;
import com.alemonte.entities.Utente;
import com.alemonte.entities.Viaggio;
import com.alemonte.service.FlixBusService;

@RestController
@RequestMapping("api")
public class FlixBusRest {
	@Autowired
	private FlixBusService service;
	
	
	@GetMapping("utenti")
	public List<Utente> getUtenti(){
		return service.getUtenti();
	}
	@PostMapping("utenti")
	public RedirectView addUtente(Utente u) {
		service.addUtente(u);
		return new RedirectView("/");
	}
	
	
	@GetMapping("viaggi")
	public List<Viaggio> getViaggi(){
		return service.getViaggi();
	}
	@PostMapping("viaggi")
		public RedirectView getAddViaggi(Viaggio v) {
			service.addViaggio(v);
			return new RedirectView("/viaggi");
		}
	
	
	@GetMapping("prenotazioni")
	public List<Prenotazione> getPrenotazioni(){
		return service.getPrenotazioni();
	}
	@PostMapping("prenotazioni")
	public RedirectView getAddPrenotazione(Prenotazione p) {
		service.addPrenotazione(p);
		return new RedirectView("/");
	}
	
	@GetMapping("dipendeti")
	public List<Dipendente> getDipendenti(){
		return service.getDipendeti();
	}
	@PostMapping("dipendeti")
	public RedirectView getAddDipendente(Dipendente d) {
		service.addDipendente(d);
		return new RedirectView("/");
	}
}
