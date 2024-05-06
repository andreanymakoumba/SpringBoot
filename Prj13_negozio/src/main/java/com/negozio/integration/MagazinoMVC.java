package com.negozio.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.negozio.service.MagazinoServiceImpl;



@Controller
public class MagazinoMVC {

	@Autowired
	MagazinoServiceImpl service;
	
	@GetMapping("products")
	
	public String getProdotti(Model m){
		
		m.addAttribute("titolo", "Elenco pérodotti disponibili");
		m.addAttribute("products", service.getProdotti());
		service.getProdotti().forEach(System.out::println);
		
		return "Products";
	}
		
	}

