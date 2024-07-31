package com.makoumba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.makoumba.entities.Biglietto;
import com.makoumba.entities.Cliente;
import com.makoumba.entities.Replica;
import com.makoumba.entities.Spetacolo;
import com.makoumba.entities.Teatro;
import com.makoumba.services.BiglietteriaService;


@RestController
@RequestMapping("/api")
public class BiglietteriaRest {
	
	@Autowired
	private BiglietteriaService service;
	
	@GetMapping("/Clienti")
	public ResponseEntity<List<Cliente>> getStudenti(){
		
		return new ResponseEntity<>(service.getClienti(), HttpStatus.OK);
	}
	
	@GetMapping("/Repliche")
	public ResponseEntity<List<Replica>> getRepliche(){
		
		return new ResponseEntity<>(service.getRepliche(), HttpStatus.OK);
	}
	
	@GetMapping("/Spetacoli")
	public ResponseEntity<List<Spetacolo>> getSpetacoli(){
		
		return new ResponseEntity<>(service.getSpetacoli(), HttpStatus.OK);
	}
	
	@GetMapping("/Teatri")
	public ResponseEntity<List<Teatro>> getTeatri(){
		
		return new ResponseEntity<>(service.getTeatri(), HttpStatus.OK);
	}
	
	@GetMapping("/Biglietti")
	public ResponseEntity<List<Biglietto>> getBiglietti(){
		
		return new ResponseEntity<>(service.getBiglietti(), HttpStatus.OK);
	}
	
}
