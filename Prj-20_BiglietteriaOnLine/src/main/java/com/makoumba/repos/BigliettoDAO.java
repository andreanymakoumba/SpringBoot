package com.makoumba.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makoumba.entities.Biglietto;

public interface BigliettoDAO extends JpaRepository<Biglietto, String> {

}
