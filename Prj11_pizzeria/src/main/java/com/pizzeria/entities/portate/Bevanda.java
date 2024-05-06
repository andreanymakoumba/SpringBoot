package com.pizzeria.entities.portate;

import com.pizzeria.entities.Portata;

public class Bevanda extends Portata{

	public Bevanda() {
		this.setTipo("Bevanda");
	}

	@Override
	public String toString() {
		return "Bevanda [toString()=" + super.toString() + "]";
	}
	
	
}
