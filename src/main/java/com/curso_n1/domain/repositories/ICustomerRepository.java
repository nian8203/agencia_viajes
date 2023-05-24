package com.curso_n1.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso_n1.domain.entities.CustomerEntity;

public interface ICustomerRepository extends JpaRepository<CustomerEntity, String> {

}
