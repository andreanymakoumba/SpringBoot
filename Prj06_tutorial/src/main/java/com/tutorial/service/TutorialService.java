package com.tutorial.service;

import java.util.List;

import com.tutorial.Entities.Tutorial;

public interface TutorialService {

List<Tutorial> getTutorials();
	
	Tutorial addTuttorial(Tutorial t);
}
