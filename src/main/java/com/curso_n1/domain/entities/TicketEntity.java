package com.curso_n1.domain.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "ticket")
public class TicketEntity {

	@Id
	private UUID id;
	private LocalDate departureDate;
	private LocalDate arrivalDate;
	private LocalDate purchaseDate;
	private BigDecimal price;
	@ManyToOne
	@JoinColumn(name = "fly_id")
	private FlyEntity fly;
	
	@ManyToOne
	@JoinColumn(name = "tour_id", nullable = true)
	private TourEntity tour;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private CustomerEntity customer;	

	public FlyEntity getFly() {
		return fly;
	}

	public void setFly(FlyEntity fly) {
		this.fly = fly;
	}

	public TicketEntity() {
		super();
	}

	public TicketEntity(UUID id, LocalDate departureDate, LocalDate arrivalDate, LocalDate purchaseDate,
			BigDecimal price) {
		super();
		this.id = id;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.purchaseDate = purchaseDate;
		this.price = price;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
