package com.tutorial.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tutorial")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	
	@Column (name = "titolo")
	private String title;
	
	@Column(name = "descrizione")
	private String descrizione;
	
	@Column (name = "publicato")
	private boolean published;
	
	@OneToOne(mappedBy = "tutorial")
	private TutorialDetail dettaglio;
	
	public TutorialDetail getDettaglio() {
		return dettaglio;
	}

	public void setDettaglio(TutorialDetail dettaglio) {
		this.dettaglio = dettaglio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}
	
	
	
}
