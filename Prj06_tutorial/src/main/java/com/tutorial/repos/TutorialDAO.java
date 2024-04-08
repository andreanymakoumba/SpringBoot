package com.tutorial.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.Entities.Tutorial;

public interface TutorialDAO extends JpaRepository<Tutorial, Integer> {

}
