package com.ricette.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "ricette")
public class Ricetta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String ingredienti;
	private String preparazione;
	private int tempo;
	private int difficolta;
	private int kcal;
	
	@Transient  //per non diventare una proprità del db
	private String costo;
	
	
	
	
	
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	public String getCosto() {
		return costo;
	}
	public void setCosto(String costo) {
		this.costo = costo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIngredienti() {
		return ingredienti;
	}
	public void setIngredienti(String ingredienti) {
		this.ingredienti = ingredienti;
	}
	public String getPreparazione() {
		return preparazione;
	}
	public void setPreparazione(String preparazione) {
		this.preparazione = preparazione;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public int getDifficolta() {
		return difficolta;
	}
	public void setDifficolta(int difficolta) {
		this.difficolta = difficolta;
	}
	
	
	
	
}
