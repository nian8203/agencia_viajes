package com.curso_n1.domain.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "customer")
public class CustomerEntity {

	@Id
	private String dni;
	@Column(length = 50)
	private String full_name;
	@Column(length = 20)
	private String credit_card;
	@Column(length = 12)
	private String phone_number;
	private Integer total_flights;
	private Integer total_lodgings;
	private Integer total_tours;
	
	@OneToMany(
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER,
			orphanRemoval = true,
			mappedBy = "customer"
			)
	private Set<TicketEntity> tickets;
	
	@OneToMany(
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER,
			orphanRemoval = true,
			mappedBy = "customer"
			)
	private Set<ReservationEntity> reservations;
	
	@OneToMany(
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER,
			orphanRemoval = true,
			mappedBy = "customer"
			)
	private Set<TourEntity> tours;

	public CustomerEntity() {
		super();
	}

	public CustomerEntity(String dni, String full_name, String credit_card, String phone_number, Integer total_flights,
			Integer total_lodgings, Integer total_tours) {
		super();
		this.dni = dni;
		this.full_name = full_name;
		this.credit_card = credit_card;
		this.phone_number = phone_number;
		this.total_flights = total_flights;
		this.total_lodgings = total_lodgings;
		this.total_tours = total_tours;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getCredit_card() {
		return credit_card;
	}

	public void setCredit_card(String credit_card) {
		this.credit_card = credit_card;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public Integer getTotal_flights() {
		return total_flights;
	}

	public void setTotal_flights(Integer total_flights) {
		this.total_flights = total_flights;
	}

	public Integer getTotal_lodgings() {
		return total_lodgings;
	}

	public void setTotal_lodgings(Integer total_lodgings) {
		this.total_lodgings = total_lodgings;
	}

	public Integer getTotal_tours() {
		return total_tours;
	}

	public void setTotal_tours(Integer total_tours) {
		this.total_tours = total_tours;
	}

}
