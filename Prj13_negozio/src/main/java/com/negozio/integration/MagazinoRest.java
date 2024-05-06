package com.negozio.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.negozio.entities.Products;
import com.negozio.service.MagazinoService;

@RestController
@RequestMapping("api")
public class MagazinoRest {

	@Autowired
	MagazinoService service;
	
	@GetMapping("products")
	
	public ResponseEntity<Products[]> getProdotti(@PathVariable int min, @PathVariable int max){
		return new ResponseEntity<Products[]>
				.getProdotti()
				.length
				.filter(p -> p.getPrice()<max)
				.filter(p -> p.getPrice()>min)
				.toList(), HttpStatus.OK);
				
	}
}
