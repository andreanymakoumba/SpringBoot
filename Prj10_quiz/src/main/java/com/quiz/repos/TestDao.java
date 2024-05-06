package com.quiz.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.entities.Test;


@Repository
public interface TestDao extends JpaRepository<Test, Integer> {

}
