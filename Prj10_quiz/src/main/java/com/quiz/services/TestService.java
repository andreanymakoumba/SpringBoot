package com.quiz.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.entities.Persona;
import com.quiz.entities.Test;

@Service
public interface TestService {

	List<Test> getTest();
	Test getTestById(int id);
	Test addTest(Test t);
	Test updateTest(Test t);
	void deleteTest(Test t);
	
}
