package com.alemonte.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.alemonte.service.FlixBusService;

@Controller
public class FilxBusMVC {
	private FlixBusService service;
	
	@GetMapping("")
	public String getHome() {
		return "index";
	}
	
	@GetMapping("viaggi")
	public String getViaggi() {
		return "viaggi";
	}
	@GetMapping("login")
	public String getLogin() {
		return "login";
	}
	@GetMapping("registrazione")
	public String getRegistrati() {
		return "registrazione";
	}
	@GetMapping("loginDipendenti")
		public String GetLoginDipendenti() {
			return "loginDipendenti";
		}
	@GetMapping("sucesso")
	public String getSuccesso() {
		return "sucesso";
	}
	@GetMapping("pagamento")
	public String getPagamento() {
		return "pagamento";
	}
	@GetMapping("registrazioneDipendente")
	public String getRegistrazioneDipendenti() {
		return "registrazioneDipendente";
	}
	@GetMapping("addViaggio")
	public String getAddViaggio() {
		return "addViaggio";
	}
	@GetMapping("prenotazioni")
	public String getPrenotazioni() {
		return "prenotazioni";
	}
	@GetMapping("dipendenti")
	public String getDipendenti() {
		return "dipendenti";
	}
	@GetMapping("utenti")
	public String getUtenti() {
		return "utenti";
	}
	}

