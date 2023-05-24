package com.curso_n1.domain.repositories;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso_n1.domain.entities.FlyEntity;

public interface IFlyRepository extends JpaRepository<FlyEntity, Long> {
	
	@Query("select f from fly f where f.price < :price")
	Set<FlyEntity> selectLessPrice(BigDecimal price);
	
	@Query("select f from fly f where f.price between :min and :max")
	Set<FlyEntity> selectBetweenPrice(BigDecimal min, BigDecimal max);
	
	@Query("select f from fly f where f.origin_name = :origin and f.destiny_name = :destiny")
	Set<FlyEntity> selectOriginDestiny(String origin, String destiny);
	
	@Query("select f from fly f join fetch f.tickets t where t.id = :id")
	Optional<FlyEntity> findByTicketId(UUID id);

}
