package com.curso_n1.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso_n1.domain.entities.TourEntity;

public interface ITourRepository extends JpaRepository<TourEntity, Long> {

}
