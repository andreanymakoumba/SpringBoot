package com.quiz.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.entities.Domanda;

@Repository
public interface DomandaDao extends JpaRepository<Domanda, Integer> {

}
