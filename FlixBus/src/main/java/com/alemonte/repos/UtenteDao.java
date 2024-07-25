package com.alemonte.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alemonte.entities.Utente;

public interface UtenteDao extends JpaRepository<Utente, Integer> {
	
}
