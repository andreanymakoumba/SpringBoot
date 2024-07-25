package com.alemonte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alemonte.entities.Dipendente;
import com.alemonte.entities.Prenotazione;
import com.alemonte.entities.Utente;
import com.alemonte.entities.Viaggio;
import com.alemonte.repos.DipendentiDao;
import com.alemonte.repos.PrenotazioneDao;
import com.alemonte.repos.UtenteDao;
import com.alemonte.repos.ViaggioDao;
@Service
public class FilxBusServiceImpl implements FlixBusService{

	@Autowired
	private UtenteDao uDao;
	@Autowired 
	private PrenotazioneDao pDao;
	@Autowired
	private ViaggioDao vDao;
	@Autowired
	private DipendentiDao dDao;
	
	@Override
	public List<Utente> getUtenti() {
		// TODO Auto-generated method stub
		return uDao.findAll();
	}

	@Override
	public Utente addUtente(Utente u) {
		// TODO Auto-generated method stub
		return uDao.save(u);
	}

	@Override
	public List<Prenotazione> getPrenotazioni() {
		// TODO Auto-generated method stub
		return pDao.findAll();
	}

	@Override
	public Prenotazione addPrenotazione(Prenotazione p) {
		// TODO Auto-generated method stub
		return pDao.save(p);
	}

	@Override
	public List<Viaggio> getViaggi() {
		// TODO Auto-generated method stub
		return vDao.findAll();
	}

	@Override
	public Viaggio addViaggio(Viaggio v) {
		// TODO Auto-generated method stub
		return vDao.save(v);
	}

	@Override
	public List<Dipendente> getDipendeti() {
		// TODO Auto-generated method stub
		return dDao.findAll();
	}

	@Override
	public Dipendente addDipendente(Dipendente d) {
		// TODO Auto-generated method stub
		return dDao.save(d);
	}

}
