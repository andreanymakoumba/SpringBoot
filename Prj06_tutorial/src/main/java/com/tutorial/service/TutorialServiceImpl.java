package com.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.Entities.Tutorial;
import com.tutorial.repos.TutorialDAO;

@Service
public class TutorialServiceImpl implements TutorialService {

	@Autowired
	private TutorialDAO dao;

	@Override
	public List<Tutorial> getTutorials() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tutorial addTuttorial(Tutorial t) {
		// TODO Auto-generated method stub
		return null;
	}
}
