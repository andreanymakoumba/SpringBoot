package com.pizzeria.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pizzeria.entities.Cliente;


public interface ClientiDAO extends JpaRepository<Cliente, Integer> {

}
