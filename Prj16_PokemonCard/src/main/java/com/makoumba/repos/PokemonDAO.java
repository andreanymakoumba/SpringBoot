package com.makoumba.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makoumba.entities.Pokemon;

public interface PokemonDAO extends JpaRepository<Pokemon, Integer>{

}
