package com.magazino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magazino.repos.MovimentoDao;
import com.magazino.repos.ProdottoDao;
import com.mgazino.entities.Movimento;
import com.mgazino.entities.Prodotto;

@Service
public class MagazinoServiceImpl implements MagazinoService{
	
	@Autowired
	private MovimentoDao movimentoDao;
	
	@Autowired
	private ProdottoDao prodottoDao;
	
	//per Prodotto 
	
	public List<Prodotto> getProdotti() {
		return prodottoDao.findAll();
	}
	
	public Prodotto getProdottoById(int id) {
		return prodottoDao.findById(id).get();
	} 
	
	public Prodotto updateProdotto(Prodotto p) {
		return prodottoDao.save(p);
	}
	
	public Prodotto addProdotto(Prodotto p) {
		return prodottoDao.save(p);
	}
	
	 public void deleteProdotto(Prodotto p) {
		prodottoDao.delete(p);
	} 

	// per Movimento
	
	public List<Movimento> getMovimenti() {
		return movimentoDao.findAll();
	}

	public Movimento getMovimentoById(int id) {
		return movimentoDao.findById(id).get();
	}
	
	public Movimento updateMovimento(Movimento m) {
		return movimentoDao.save(m);
	}
	
	public Movimento addMovimento(Movimento m) {
		return movimentoDao.save(m);
	}
	
	public void deleteMovimento(Movimento m) {
		movimentoDao.delete(m);
	}
	
	
	
}