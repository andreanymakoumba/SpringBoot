package com.quiz.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.entities.Persona;

@Repository
public interface PersonaDao extends JpaRepository<Persona, Integer> {

}
