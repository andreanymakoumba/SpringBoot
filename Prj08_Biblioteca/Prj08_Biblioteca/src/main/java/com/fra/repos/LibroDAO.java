package com.fra.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fra.entities.Libro;

public interface LibroDAO extends JpaRepository<Libro, Integer>{

	
}
