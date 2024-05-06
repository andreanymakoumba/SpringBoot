package com.pizzeria.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Ordine {

	private int id;
	private static final int PREZZO_COPERTO = 0;
	private List<Portata> portate;
	private Tavolo tavolo;
	private Cliente cliente;
	private LocalDate dataOrdine;
	private LocalDateTime oraOrdine;
	private boolean asporto;
	
	public List<Portata> getPortate() {
		return portate;
	}
	public void setPortate(List<Portata> portate) {
		this.portate = portate;
	}
	public Tavolo getTavolo() {
		return tavolo;
	}
	public void setTavolo(Tavolo tavolo) {
		this.tavolo = tavolo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public LocalDate getDataordine() {
		return dataOrdine;
	}
	public void setDataordine(LocalDate dataordine) {
		this.dataOrdine = dataordine;
	}
	public LocalDateTime getOraOrdine() {
		return oraOrdine;
	}
	public void setOraOrdine(LocalDateTime oraOrdine) {
		this.oraOrdine = oraOrdine;
	}
	public boolean isAsporto() {
		return asporto;
	}
	public void setAsporto(boolean asporto) {
		this.asporto = asporto;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String print() {
		StringBuilder scontrino = new StringBuilder();
		double totale = 0;
		
		if(!this.asporto) {
		scontrino.append("Tavolo " + tavolo.getNumero()+ "\n");
		scontrino.append("Persone " + tavolo.getPersone()+ "\n");
		totale += tavolo.getPersone().size()*PREZZO_COPERTO;
		}
		
		scontrino.append("Cliente " + cliente.getUsername()+ "\n");
		scontrino.append("Data " + dataOrdine+"\n");
		scontrino.append("Ora " + oraOrdine+"\n");
		scontrino.append("Portate "+"\n");
		
		
		for(Portata portata : portate) {
			scontrino.append(portata.getNome()+"\t\t" + portata.getPrezzo() +"\n");
			totale += portata.getPrezzo();
		}
		scontrino.append("totale " + "\t\t" + totale +"\n" );
		return scontrino.toString();
	}
		
	}


