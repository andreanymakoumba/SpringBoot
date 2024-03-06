package com.makoumba.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.makoumba.Gioco;

@Repository
public interface GiocoDAO extends JpaRepository<Gioco, Integer> {

}
