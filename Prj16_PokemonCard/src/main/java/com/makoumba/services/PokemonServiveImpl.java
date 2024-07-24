package com.makoumba.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makoumba.entities.Pokemon;
import com.makoumba.entities.PokemonPic;
import com.makoumba.repos.PokemonDAO;
import com.makoumba.repos.PokemonPicDAO;

@Service
public class PokemonServiveImpl implements  PokemonService{

	@Autowired
	private PokemonDAO dao;
	
	@Autowired
	private PokemonPicDAO picDAO;
	
	@Override
	public List<Pokemon> getAllPokemon() {
		
		return dao.findAll();
	}

	@Override
	public List<PokemonPic> getPics() {
		
		return picDAO.findAll();
	}

	@Override
	public PokemonPic getPicByNome(String nome) {
		
		return picDAO.findByNome(nome);
	}

}
