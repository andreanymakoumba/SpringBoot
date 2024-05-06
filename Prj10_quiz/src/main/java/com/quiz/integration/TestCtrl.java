package com.quiz.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entities.Test;
import com.quiz.services.TestService;


@RestController
public class TestCtrl {

	@Autowired
	TestService testService;
	
	@GetMapping("test")
	public List<Test> getAll(){
		return testService.getTest();
	}
	
	@PostMapping("test")
	public Test addRicetta(@RequestBody Test t) {
		return testService.addTest(t);
	}
	
	@PutMapping("test")
	public Test updateRicetta(@RequestBody Test t) {
		return testService.updateTest(t);
	}
}
