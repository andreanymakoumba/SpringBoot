package com.alemonte.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Viaggi")
public class Viaggio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String origine;
	private String destinazione;
	private Date dataviaggio;
	private int postidisponibili;
	private String locandina;
	private double prezzo;
	
	public Viaggio() {
		// TODO Auto-generated constructor stub
	}
	public Viaggio(int id, String origine, String destinazione, Date dataViaggio, int postiDisponibili) {
		this.id = id;
		this.origine = origine;
		this.destinazione = destinazione;
		this.dataviaggio = dataViaggio;
		this.postidisponibili = postiDisponibili;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrigine() {
		return origine;
	}
	public void setOrigine(String origine) {
		this.origine = origine;
	}
	public String getDestinazione() {
		return destinazione;
	}
	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}
	public Date getDataViaggio() {
		return dataviaggio;
	}
	public void setDataViaggio(Date dataViaggio) {
		this.dataviaggio = dataViaggio;
	}
	public int getPostiDisponibili() {
		return postidisponibili;
	}
	public void setPostiDisponibili(int postiDisponibili) {
		this.postidisponibili = postiDisponibili;
	}
	public String getLocandina() {
		return locandina;
	}
	public void setLocandina(String locandina) {
		this.locandina = locandina;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
}
