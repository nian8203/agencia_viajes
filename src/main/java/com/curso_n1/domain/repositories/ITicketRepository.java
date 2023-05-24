package com.curso_n1.domain.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso_n1.domain.entities.TicketEntity;

public interface ITicketRepository extends JpaRepository<TicketEntity, UUID> {

}
