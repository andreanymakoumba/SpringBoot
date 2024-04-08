package com.tutorial.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.Entities.TutorialDetail;

public interface TutorialDettaglioDAO extends JpaRepository<TutorialDetail, Integer> {

}
