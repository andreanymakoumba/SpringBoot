package com.alemonte.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alemonte.entities.Viaggio;

public interface ViaggioDao extends JpaRepository<Viaggio, Integer> {

}
