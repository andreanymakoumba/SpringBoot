package com.quiz.entities;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "test")
public class Test {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int idTest;
	private LocalDate data;
	private String nomeTest;
	
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public Test(int idTest, LocalDate data, String nomeTest) {
		super();
		this.idTest = idTest;
		this.data = data;
		this.nomeTest = nomeTest;
	}
	
	public int getIdTest() {
		return idTest;
	}

	public void setIdTest(int idTest) {
		this.idTest = idTest;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getNomeTest() {
		return nomeTest;
	}

	public void setNomeTest(String nomeTest) {
		this.nomeTest = nomeTest;
	}

	@Override
	public String toString() {
		return "Test [data=" + data + ", nomeTest=" + nomeTest + "]";
	}
	
	
}
