package com.fra.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fra.entities.Autore;
import com.fra.entities.Editore;
import com.fra.entities.Libro;
import com.fra.services.BibliotecaService;

@RequestMapping("api")
@RestController
public class BibliotecaREST {

	@Autowired
	private BibliotecaService service;

	@GetMapping("editori")
	public ResponseEntity <List<Editore>> getEditori(){
		return new ResponseEntity<List<Editore>>(service.getEditori(),HttpStatus.OK);
	}
	
	@GetMapping("autori")
	public ResponseEntity <List<Autore>> getAutori(){
		return new ResponseEntity <List<Autore>>(service.getAutori(),HttpStatus.OK);
	}
	
	@GetMapping("libri")
	public ResponseEntity <List<Libro>> getLibri(){
		return new ResponseEntity<List<Libro>>(service.getLibri(),HttpStatus.OK);
	}
	
}
