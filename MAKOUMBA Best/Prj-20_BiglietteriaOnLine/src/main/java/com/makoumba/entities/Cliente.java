package com.makoumba.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clienti")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codCliente;
	private String cognome;
	private String nome;
	private String telefono;
	private String email;
	
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
//	public Cliente(Long codCliente, String cognome, String nome, String telefono, String email) {
//		super();
//		this.codCliente = codCliente;
//		this.cognome = cognome;
//		this.nome = nome;
//		this.telefono = telefono;
//		this.email = email;
//	}

	public Long getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(Long codCliente) {
		this.codCliente = codCliente;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
