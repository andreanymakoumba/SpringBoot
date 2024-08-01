package com.makoumba.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makoumba.entities.Replica;

public interface ReplicaDAO extends JpaRepository<Replica, String> {

}
