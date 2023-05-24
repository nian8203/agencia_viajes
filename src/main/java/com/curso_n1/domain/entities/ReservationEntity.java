package com.curso_n1.domain.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "reservation")
public class ReservationEntity {

	@Id
	private UUID id;
	@Column(name = "date_reservation")
	private LocalDateTime dateTimeReservation;
	private LocalDate dateStart;
	private LocalDate dateEnd;
	private Integer totalDays;
	private BigDecimal price;
	@ManyToOne
	@JoinColumn(name = "hotel_id")
	private HotelEntity hotel;
	@ManyToOne
	@JoinColumn(name = "tour_id", nullable = true)
	private TourEntity tour;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private CustomerEntity customer;

	public ReservationEntity() {
		super();
	}

	public ReservationEntity(UUID id, LocalDateTime dateTimeReservation, LocalDate dateStart, LocalDate dateEnd,
			Integer totalDays, BigDecimal price) {
		super();
		this.id = id;
		this.dateTimeReservation = dateTimeReservation;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.totalDays = totalDays;
		this.price = price;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public LocalDateTime getDateTimeReservation() {
		return dateTimeReservation;
	}

	public void setDateTimeReservation(LocalDateTime dateTimeReservation) {
		this.dateTimeReservation = dateTimeReservation;
	}

	public LocalDate getDateStart() {
		return dateStart;
	}

	public void setDateStart(LocalDate dateStart) {
		this.dateStart = dateStart;
	}

	public LocalDate getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(LocalDate dateEnd) {
		this.dateEnd = dateEnd;
	}

	public Integer getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(Integer totalDays) {
		this.totalDays = totalDays;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
