package com.makoumba.services;

import java.util.List;

import com.makoumba.entities.Pokemon;
import com.makoumba.entities.PokemonPic;

public interface PokemonService {

	List<Pokemon> getAllPokemon();
	
	List<PokemonPic> getPics();
	PokemonPic getPicByNome(String nome);
}
