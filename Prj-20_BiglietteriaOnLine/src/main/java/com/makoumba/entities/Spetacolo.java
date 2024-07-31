package com.makoumba.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="spettacoli")
public class Spetacolo {
	
	@Id
	private String codSpettacolo;
	
	private String titolo;
	private  String autore;
	private String regista;
	private int prezzo;
	
	@ManyToOne
    @JoinColumn(name = "codTeatri")
	private Teatro teatro;
	
	
	public String getCodSpettacolo() {
		return codSpettacolo;
	}
	public void setCodSpettacolo(String codSpettacolo) {
		this.codSpettacolo = codSpettacolo;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getRegista() {
		return regista;
	}
	public void setRegista(String regista) {
		this.regista = regista;
	}
	public int getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	public Teatro getTeatro() {
		return teatro;
	}
	public void setTeatro(Teatro teatro) {
		this.teatro = teatro;
	}
	
	
	

}
