package com.quiz.entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "persone")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int idPersona;
	private double puntegioTotale;
	
	@OneToMany
	private Set <Test> test;


	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public double getPuntegioTotale() {
		return puntegioTotale;
	}

	public void setPuntegioTotale(double puntegioTotale) {
		this.puntegioTotale = puntegioTotale;
	}

	

	public Set<Test> getTest() {
		return test;
	}

	public void setTest(Set<Test> test) {
		this.test = test;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", puntegioTotale=" + puntegioTotale + ", test=" + test + "]";
	}
	
	
	
}
