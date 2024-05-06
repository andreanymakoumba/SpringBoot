package com.pizzeria.services;

import java.util.List;

import com.pizzeria.entities.Cliente;
import com.pizzeria.entities.Ordine;
import com.pizzeria.entities.Portata;
import com.pizzeria.entities.Tavolo;
import com.pizzeria.entities.portate.*;
;

public interface PizzeriaService {

	
	List<Pizza> getPizza();
	List<Bevanda> getBevande();
	List<Dolce> getDolci();
	List<Altro> getAltro();
	
	List<Cliente> getClienti();
	List<Ordine> getordini();
	List<Portata> getPortate();
	List<Tavolo> getTavoli();
	
	//By ID
	
	Pizza getPizzeById(int id);
	Bevanda getBevandeByIdS(int id);
	Dolce getDolciById(int id);
	Altro getAltroById(int id);
	
	Ordine getOrdiniById(int id);
	Cliente getClientiById(int id);
	Portata getPortateById(int id);
	Tavolo getTavoliById(int id);
	
	//--------
	
	Pizza addPizza(Pizza p);
	Bevanda addBevanda(Bevanda b);
	Dolce addDolce(Dolce d);
	Altro addAltro(Altro a);
	
	Cliente addCliente(Cliente c);
	Ordine addOrdine(Ordine o);
	Portata addPortata(Portata p);
	Tavolo addTavolo(Tavolo t);
}
