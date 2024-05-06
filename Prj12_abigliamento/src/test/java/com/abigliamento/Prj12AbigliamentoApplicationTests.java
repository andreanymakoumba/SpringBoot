package com.abigliamento;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.abigliamento.services.MioProdottoService;

@SpringBootTest
class Prj12AbigliamentoApplicationTests {

	@Autowired
	MioProdottoService service;
	
	@Test
	void contextLoads() {
		service.caricaProdotti();
	}

}
