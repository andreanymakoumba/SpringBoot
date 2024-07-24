package com.makoumba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.makoumba.entities.Pokemon;
import com.makoumba.entities.PokemonPic;
import com.makoumba.services.PokemonService;

@RestController
@RequestMapping("api")
public class PokemonRest {

	@Autowired
	private PokemonService service;
	
	@GetMapping("pokemon")
	public ResponseEntity<List<Pokemon>> getAll() {
		return new ResponseEntity<List<Pokemon>>(service.getAllPokemon(), HttpStatus.OK);
	}
	
	@GetMapping("pics")
	public ResponseEntity<List<PokemonPic>> getPics() {
		return new ResponseEntity<List<PokemonPic>>(service.getPics(), HttpStatus.OK);	
	}
}
