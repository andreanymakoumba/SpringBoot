package com.pizzeria.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizzeria.entities.Cliente;
import com.pizzeria.entities.Ordine;
import com.pizzeria.entities.Portata;
import com.pizzeria.entities.Tavolo;
import com.pizzeria.entities.portate.Altro;
import com.pizzeria.entities.portate.Bevanda;
import com.pizzeria.entities.portate.Dolce;
import com.pizzeria.entities.portate.Pizza;
import com.pizzeria.repos.ClientiDAO;
import com.pizzeria.repos.PortataDAO;

@Service
public class PizzeriaServiceImpl implements PizzeriaService{
	
	@Autowired
	private ClientiDAO daoClienti;
	@Autowired
	private  PortataDAO daoPortata;
	
	
	@Override
	public List<Pizza> getPizza() {
		
		List<Pizza> pizze = new ArrayList<Pizza>();
		
		 daoPortata
				.findAll()
				.stream()
				.filter(p-> p.getTipo().equalsIgnoreCase("pizza"))
				.forEach(p -> {
					Pizza pizza = new Pizza();
					pizza.setNome(p.getNome());
					pizza.setId(p.getId());
					pizza.setDescrizione(p.getDescrizione());
					pizza.setPrezzo(p.getPrezzo());
					pizza.setTipo(p.getTipo());
					pizze.add(pizza);
				});
		return pizze;
	}

	@Override
	public List<Bevanda> getBevande() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dolce> getDolci() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Altro> getAltro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> getClienti() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ordine> getordini() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Portata> getPortate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tavolo> getTavoli() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pizza getPizzeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bevanda getBevandeByIdS(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dolce getDolciById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Altro getAltroById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ordine getOrdiniById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente getClientiById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Portata getPortateById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tavolo getTavoliById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pizza addPizza(Pizza p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bevanda addBevanda(Bevanda b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dolce addDolce(Dolce d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Altro addAltro(Altro a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente addCliente(Cliente c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ordine addOrdine(Ordine o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Portata addPortata(Portata p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tavolo addTavolo(Tavolo t) {
		// TODO Auto-generated method stub
		return null;
	}

}
