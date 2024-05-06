package com.abigliamento.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abigliamento.entities.MioProdotto;

@Repository
public interface MioProdottoDao extends JpaRepository<MioProdotto, Integer> {

}
