package com.curso_n1.domain.repositories;

import java.math.BigDecimal;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso_n1.domain.entities.HotelEntity;

public interface IHotelRepository extends JpaRepository<HotelEntity, Long> {

	Set<HotelEntity> findByPriceLessThan(BigDecimal price);
	
	Set<HotelEntity> findByPriceBetween(BigDecimal min, BigDecimal max);
	
	Set<HotelEntity> findByRatingGreaterThan(Integer rating);
}
