package com.makoumba.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makoumba.entities.Biglietto;
import com.makoumba.entities.Cliente;
import com.makoumba.entities.Replica;
import com.makoumba.entities.Spetacolo;
import com.makoumba.entities.Teatro;
import com.makoumba.repos.BigliettoDAO;
import com.makoumba.repos.ClienteDAO;
import com.makoumba.repos.ReplicaDAO;
import com.makoumba.repos.SpetacoloDAO;
import com.makoumba.repos.TeatroDAO;

@Service
public class BiglietteriaServiceImpl implements BiglietteriaService{

	@Autowired
	private ClienteDAO clienteDao;
	
	@Autowired
	private BigliettoDAO bigliettoDao;
	
	@Autowired
	private ReplicaDAO replicaDao;
	
	@Autowired
	private SpetacoloDAO spetacoloDao;
	
	@Autowired
	private TeatroDAO teatroDao;
	
	@Override
	public List<Cliente> getClienti() {
		return clienteDao.findAll();
	}

	@Override
	public List<Biglietto> getBiglietti() {
		return bigliettoDao.findAll();
	}

	@Override
	public List<Spetacolo> getSpetacoli() {
		return spetacoloDao.findAll();
	}

	@Override
	public List<Teatro> getTeatri() {
		return teatroDao.findAll();
	}

	@Override
	public List<Replica> getRepliche() {
		return replicaDao.findAll();
	}

	@Override
	public Biglietto addBiglietto(Biglietto b) {
		return bigliettoDao.save(b);
	}

	@Override
	public Biglietto updateBiglietto(Biglietto b) {
		return bigliettoDao.save(b);
	}

	@Override
	public void deleteBiglietto(Biglietto b) {
		bigliettoDao.delete(b);
	}
	

}
