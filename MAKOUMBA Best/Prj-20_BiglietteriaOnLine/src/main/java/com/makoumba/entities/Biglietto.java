package com.makoumba.entities;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="biglietti")
public class Biglietto {

	@Id
//	@GeneratedValue(strategy = GenerationType.UUID)
	private String codOperazione;
	
	 @ManyToOne
	  @JoinColumn(name = "codCliente")
	private Cliente cliente;
	
	@OneToOne
	private Replica replica;
	
	private LocalDate data;
	private String tipoPagamento;
	private int quantita;
	public Biglietto() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Biglietto(String codOperazione, Cliente cliente, Replica replica, LocalDate data, String tipoPagamento,
			int quantita) {
		super();
		this.codOperazione = codOperazione;
		this.cliente = cliente;
		this.replica = replica;
		this.data = data;
		this.tipoPagamento = tipoPagamento;
		this.quantita = quantita;
	}



	public String getCodOperazione() {
		return codOperazione;
	}
	public void setCodOperazione(String codOperazione) {
		this.codOperazione = codOperazione;
	}
	public String getTipoPagamento() {
		return tipoPagamento;
	}
	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	public Cliente getCod_cliente() {
		return cliente;
	}
	public void setCod_cliente(Cliente cod_cliente) {
		this.cliente = cod_cliente;
	}
	public Replica getCod_replica() {
		return replica;
	}
	public void setCod_replica(Replica cod_replica) {
		this.replica = cod_replica;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	
	
	
}
