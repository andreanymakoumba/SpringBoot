package com.quiz.entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "domandeTest")
public class DomandaTest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int idDomandTest;
	
	@ManyToMany
	 private Set <Test> test;
	
	@ManyToMany 
	private Set <Domanda> domanda;

	public DomandaTest(int idDomandTest, Set<Test> test, Set<Domanda> domanda) {
		super();
		this.idDomandTest = idDomandTest;
		this.test = test;
		this.domanda = domanda;
	}

	public int getIdDomandTest() {
		return idDomandTest;
	}

	public void setIdDomandTest(int idDomandTest) {
		this.idDomandTest = idDomandTest;
	}

	public Set<Test> getTest() {
		return test;
	}

	public void setTest(Set<Test> test) {
		this.test = test;
	}

	public Set<Domanda> getDomanda() {
		return domanda;
	}

	public void setDomanda(Set<Domanda> domanda) {
		this.domanda = domanda;
	}

	@Override
	public String toString() {
		return "DomandaTest [idDomandTest=" + idDomandTest + ", test=" + test + ", domanda=" + domanda + "]";
	}
	

	
	
}
