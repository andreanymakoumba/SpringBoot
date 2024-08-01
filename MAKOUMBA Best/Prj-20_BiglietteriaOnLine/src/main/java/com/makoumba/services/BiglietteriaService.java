package com.makoumba.services;

import java.util.List;

import com.makoumba.entities.Biglietto;
import com.makoumba.entities.Cliente;
import com.makoumba.entities.Replica;
import com.makoumba.entities.Spetacolo;
import com.makoumba.entities.Teatro;

public interface BiglietteriaService {
	
	List<Cliente> getClienti();
	List<Biglietto> getBiglietti();
	List<Spetacolo> getSpetacoli();
	List<Teatro> getTeatri();
	List<Replica> getRepliche();
	
	Biglietto addBiglietto(Biglietto b);
	Biglietto updateBiglietto(Biglietto b);
	void deleteBiglietto(Biglietto b);

}
