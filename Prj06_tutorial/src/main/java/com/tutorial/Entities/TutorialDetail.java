package com.tutorial.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tutorialdettaglio")
public class TutorialDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	
	private Tutorial tutorial;
	
	
	
}
