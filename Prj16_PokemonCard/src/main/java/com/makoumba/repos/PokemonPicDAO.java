package com.makoumba.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makoumba.entities.PokemonPic;

public interface PokemonPicDAO extends JpaRepository<PokemonPic, Integer>{

	PokemonPic findByNome(String nome); //derived Query
	
}
