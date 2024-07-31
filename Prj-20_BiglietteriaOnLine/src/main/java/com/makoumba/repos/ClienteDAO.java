package com.makoumba.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makoumba.entities.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Long> {

}
