package com.curso_n1.domain.entities;

import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name = "tour")
public class TourEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToMany(
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER,
			orphanRemoval = true,
			mappedBy = "tour"
			)
	private Set<ReservationEntity> reservations;
	
	@OneToMany(
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER,
			orphanRemoval = true,
			mappedBy = "tour"
			)
	private Set<TicketEntity> tickets;
	
	@ManyToOne
	@JoinColumn(name = "id_customer")
	private CustomerEntity customer;
	

}
