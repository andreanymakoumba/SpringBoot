package com.fra.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fra.entities.Autore;
import com.fra.entities.Editore;
import com.fra.entities.Libro;
import com.fra.repos.AutoreDAO;
import com.fra.repos.EditoreDAO;
import com.fra.repos.LibroDAO;

@Service
public class BibliotecaServiceImpl implements BibliotecaService {
	@Autowired
	private LibroDAO libroDAO;
	@Autowired
	private AutoreDAO autoreDAO;
	@Autowired
	private EditoreDAO editoreDAO;


	@Override
	public List<Libro> getLibri() {
		// TODO Auto-generated method stub
		return libroDAO.findAll();
	}

	@Override
	public List<Autore> getAutori() {
		// TODO Auto-generated method stub
		return autoreDAO.findAll();
	}

	@Override
	public List<Editore> getEditori() {
		// TODO Auto-generated method stub
		return editoreDAO.findAll();
	}

	@Override
	public Autore addAutore(Autore a) {
		// TODO Auto-generated method stub
		return autoreDAO.save(a);
	}

	@Override
	public Editore addEditore(Editore e) {
		// TODO Auto-generated method stub
		return editoreDAO.save(e);
	}

	@Override
	public Libro addLibro(Libro l) {
		// TODO Auto-generated method stub
		return libroDAO.save(l);
	}

	@Override
	public Autore updAutore(Autore a) {
		// TODO Auto-generated method stub
		return autoreDAO.save(a);
	}

	@Override
	public Editore updEditore(Editore e) {
		// TODO Auto-generated method stub
		return editoreDAO.save(e);
	}

	@Override
	public Libro updLibro(Libro l) {
		// TODO Auto-generated method stub
		return libroDAO.save(l);
	}

	@Override
	public Boolean delAutore(Autore a) {
		// TODO Auto-generated method stub
		autoreDAO.delete(a);
		return true;
	}

	@Override
	public Boolean delEditore(Editore e) {
		// TODO Auto-generated method stub
		editoreDAO.delete(e);
		return true;
	}

	@Override
	public Boolean delLibro(Libro l) {
		// TODO Auto-generated method stub
		libroDAO.delete(l);
		return true;
	}

}
