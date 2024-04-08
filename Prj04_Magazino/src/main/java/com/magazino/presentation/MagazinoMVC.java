package com.magazino.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.magazino.services.MagazinoService;
import com.magazino.services.MagazinoService.MagazzinoService;
import com.mgazino.entities.Movimento;
import com.mgazino.entities.Prodotto;

;


@RestController

public class MagazinoMVC {


	@Autowired
	private MagazzinoService service;

	
	@CrossOrigin()
	@GetMapping("prodotti")
	public List<Prodotto> getProdotti() {
		return service.getProdotti();
	}
	
	@PostMapping("prodotti")
	public Prodotto add(@RequestBody Prodotto p) {
		return service.addProdotto(p);
	}
	
	@CrossOrigin()
	@GetMapping("movimenti")
	public List<Movimento> getMovimenti() {
		return service.getMovimenti();
	}
	
	@PostMapping("movimenti")
	public Movimento addMovimento(@RequestBody Movimento m) {
		return service.addMovimento(m);
	}

	@GetMapping("prodotti/{id}")
    public Prodotto getGiochiById(@PathVariable int id) {
        return service.getProdotti()
                .stream()
                .filter(g->g.getId() == id)
                .findFirst()
                .get();
    }
}
