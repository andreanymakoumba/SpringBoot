package com.abigliamento.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abigliamento.entities.Prodotto;
import com.abigliamento.services.ProductsService;

@RestController
@RequestMapping("api")
public class ProdottiRest {

	@Autowired
	ProductsService service;
	
	@GetMapping("prodotti")
	
	public ResponseEntity<List<Prodotto>> getProdotti(@PathVariable int min, @PathVariable int max){
		return new ResponseEntity<List<Prodotto>>(service
				.getProdotti()
				.stream()
				.filter(p -> p.getPrice()<max)
				.filter(p -> p.getPrice()>min)
				.toList(), HttpStatus.OK);
				
	}
}
