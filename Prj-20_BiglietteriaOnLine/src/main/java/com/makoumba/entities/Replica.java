package com.makoumba.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "repliche")
public class Replica {
	
	@Id
	private String codReplica;
	
	@ManyToOne
    @JoinColumn(name = "codSpettacolo")
	private Spetacolo spetacolo;
	
	private LocalDate dataReplica;

	public String getCodReplica() {
		return codReplica;
	}

	public void setCodReplica(String codReplica) {
		this.codReplica = codReplica;
	}

	public Spetacolo getSpetacolo() {
		return spetacolo;
	}

	public void setSpetacolo(Spetacolo spetacolo) {
		this.spetacolo = spetacolo;
	}

	public LocalDate getDataReplica() {
		return dataReplica;
	}

	public void setDataReplica(LocalDate dataReplica) {
		this.dataReplica = dataReplica;
	}
	


}
