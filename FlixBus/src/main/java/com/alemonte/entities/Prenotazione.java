package com.alemonte.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Prenotazioni")
public class Prenotazione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int idutente;
	private int idviaggio;
	private String statoprenotazione;
	public Prenotazione() {
		// TODO Auto-generated constructor stub
	}
	public Prenotazione(int id, int idUtente, int idViaggio, String statoPrenotazione) {
		this.id = id;
		this.idutente = idUtente;
		this.idviaggio = idViaggio;
		this.statoprenotazione = statoPrenotazione;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUtente() {
		return idutente;
	}
	public void setUtente(int idUtente) {
		this.idutente = idUtente;
	}
	public int getViaggio() {
		return idviaggio;
	}
	public void setViaggio(int idViaggio) {
		this.idviaggio = idViaggio;
	}
	public String getStatoPrenotazione() {
		return statoprenotazione;
	}
	public void setStatoPrenotazione(String statoPrenotazione) {
		this.statoprenotazione = statoPrenotazione;
	}
	
}
