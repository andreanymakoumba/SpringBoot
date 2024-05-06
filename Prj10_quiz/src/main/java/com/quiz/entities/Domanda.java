package com.quiz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Domande")
public class Domanda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int idDomanda;
	private String testoDomanda;
	private String rispostaEsatta;
	private double punteggioDomanda;
	
	public Domanda() {
		// TODO Auto-generated constructor stub
	}

	public Domanda(int idDomanda, String testoDomanda, String rispostaEsatta, double punteggioDomanda) {
		super();
		this.idDomanda = idDomanda;
		this.testoDomanda = testoDomanda;
		this.rispostaEsatta = rispostaEsatta;
		this.punteggioDomanda = punteggioDomanda;
	}

	public int getIdDomanda() {
		return idDomanda;
	}

	public void setIdDomanda(int idDomanda) {
		this.idDomanda = idDomanda;
	}

	public String getTestoDomanda() {
		return testoDomanda;
	}

	public void setTestoDomanda(String testoDomanda) {
		this.testoDomanda = testoDomanda;
	}

	public String getRispostaEsatta() {
		return rispostaEsatta;
	}

	public void setRispostaEsatta(String rispostaEsatta) {
		this.rispostaEsatta = rispostaEsatta;
	}

	public double getPunteggioDomanda() {
		return punteggioDomanda;
	}

	public void setPunteggioDomanda(double punteggioDomanda) {
		this.punteggioDomanda = punteggioDomanda;
	}

	@Override
	public String toString() {
		return "Domanda [idDomanda=" + idDomanda + ", testoDomanda=" + testoDomanda + ", rispostaEsatta="
				+ rispostaEsatta + ", punteggioDomanda=" + punteggioDomanda + "]";
	}
	
	
}
