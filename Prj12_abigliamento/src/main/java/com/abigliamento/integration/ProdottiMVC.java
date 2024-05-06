package com.abigliamento.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.abigliamento.services.ProdottoServiceImpl;



@Controller
public class ProdottiMVC {

	@Autowired
	ProdottoServiceImpl service;
	
	@GetMapping("prodotti")
	
	public String getProdotti(Model m){
		
		m.addAttribute("titolo", "Elenco pérodotti disponibili");
		m.addAttribute("products", service.getProdotti());
		service.getProdotti().forEach(System.out::println);
		
		return "Prodotti";
	}
		
	}

