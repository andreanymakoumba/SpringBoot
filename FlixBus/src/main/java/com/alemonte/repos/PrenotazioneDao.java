package com.alemonte.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alemonte.entities.Prenotazione;

public interface PrenotazioneDao extends JpaRepository<Prenotazione, Integer> {

}
