package com.quiz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entities.Domanda;
import com.quiz.entities.Test;
import com.quiz.repos.DomandaDao;
import com.quiz.repos.TestDao;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestDao testDao;

	@Override
	public List<Test> getTest() {
		
		return testDao.findAll();
	}

	@Override
	public Test getTestById(int id) {
		
		return testDao.findById(id).get();
	}

	@Override
	public Test addTest(Test t) {
		
		return testDao.save(t);
	}

	@Override
	public Test updateTest(Test t) {
		
		return testDao.save(t);
	}

	@Override
	public void deleteTest(Test t) {
		testDao.delete(t);
		
	}

	
}
