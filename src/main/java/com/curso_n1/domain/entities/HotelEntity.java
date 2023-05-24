package com.curso_n1.domain.entities;

import java.math.BigDecimal;
import java.util.Set;
import java.util.jar.Attributes.Name;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "hotel")
public class HotelEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // db = bigserial
	@Column(length = 50)
	private String name;
	@Column(length = 50)
	private String address;
	private Integer rating;
	private BigDecimal price; // db = double precision
	@OneToMany(
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER,
			orphanRemoval = true,
			mappedBy = "hotel"
			)
	private Set<ReservationEntity> reservations;

	public HotelEntity() {
		super();
	}

	public HotelEntity(Long id, String name, String address, Integer rating, BigDecimal price) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.rating = rating;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
