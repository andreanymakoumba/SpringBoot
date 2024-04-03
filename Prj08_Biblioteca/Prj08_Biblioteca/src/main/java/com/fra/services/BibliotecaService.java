package com.fra.services;

import java.util.List;

import com.fra.entities.Autore;
import com.fra.entities.Editore;
import com.fra.entities.Libro;

public interface BibliotecaService {

	List<Libro> getLibri();
	List<Autore> getAutori();
	List<Editore> getEditori();
	
	Autore addAutore(Autore a);
	Editore addEditore(Editore e);
	Libro addLibro(Libro l);
	
	Autore updAutore(Autore a);
	Editore updEditore(Editore e);
	Libro updLibro(Libro l);
	
	Boolean delAutore(Autore a);
	Boolean delEditore(Editore e);
	Boolean delLibro(Libro l);
	

	
}
