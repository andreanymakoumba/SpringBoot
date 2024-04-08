package com.magazino.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mgazino.entities.Movimento;

@Repository
public interface MovimentoDao extends JpaRepository<Movimento, Integer> {

	
}
