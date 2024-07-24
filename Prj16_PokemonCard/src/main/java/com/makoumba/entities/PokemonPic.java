package com.makoumba.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pokemon_pics")
public class PokemonPic {

	@Id
	private int id;
	
	@Column(name="name")
	private String nome;
	
	@Column(name= "img")
	private String imagine;

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

	public String getImagine() {
		return imagine;
	}

	public void setImagine(String imagine) {
		this.imagine = imagine;
	}
	
	
}
