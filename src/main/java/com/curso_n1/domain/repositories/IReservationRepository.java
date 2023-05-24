package com.curso_n1.domain.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso_n1.domain.entities.ReservationEntity;

public interface IReservationRepository extends JpaRepository<ReservationEntity, UUID> {

}
