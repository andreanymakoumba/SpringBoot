package com.ricette.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricette.entities.Ricetta;

public interface RicetteDAO extends JpaRepository<Ricetta, Integer> {

	
	List<Ricetta> findByIngredientiContains(String ingredienti);
}
