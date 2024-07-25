package com.alemonte.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alemonte.entities.Dipendente;

public interface DipendentiDao extends JpaRepository<Dipendente, Integer> {

}
