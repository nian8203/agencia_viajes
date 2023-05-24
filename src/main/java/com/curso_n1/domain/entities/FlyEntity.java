package com.curso_n1.domain.entities;

import java.math.BigDecimal;
import java.util.Set;

import com.curso_n1.util.AeroLine;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "fly")
public class FlyEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // db = bigserial
	private Double origin_lat;
	private Double origin_lng;
	private Double destiny_lat;
	private Double destiny_lng;
	@Column(length = 20)
	private String origin_name;
	@Column(length = 20)
	private String destiny_name;
	private BigDecimal price; // db = double precision
	@Enumerated(EnumType.STRING)
	private AeroLine aeroLine; // Enum
	@OneToMany(
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER,
			orphanRemoval = true,
			mappedBy = "fly"
			)
	private Set<TicketEntity> tickets;

	public Set<TicketEntity> getTickets() {
		return tickets;
	}

	public void setTickets(Set<TicketEntity> tickets) {
		this.tickets = tickets;
	}

	public FlyEntity() {
		super();
	}

	public FlyEntity(Long id, Double origin_lat, Double origin_lng, Double destiny_lat, Double destiny_lng,
			String origin_name, String destiny_name, BigDecimal price, AeroLine aeroLine) {
		super();
		this.id = id;
		this.origin_lat = origin_lat;
		this.origin_lng = origin_lng;
		this.destiny_lat = destiny_lat;
		this.destiny_lng = destiny_lng;
		this.origin_name = origin_name;
		this.destiny_name = destiny_name;
		this.price = price;
		this.aeroLine = aeroLine;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getOrigin_lat() {
		return origin_lat;
	}

	public void setOrigin_lat(Double origin_lat) {
		this.origin_lat = origin_lat;
	}

	public Double getOrigin_lng() {
		return origin_lng;
	}

	public void setOrigin_lng(Double origin_lng) {
		this.origin_lng = origin_lng;
	}

	public Double getDestiny_lat() {
		return destiny_lat;
	}

	public void setDestiny_lat(Double destiny_lat) {
		this.destiny_lat = destiny_lat;
	}

	public Double getDestiny_lng() {
		return destiny_lng;
	}

	public void setDestiny_lng(Double destiny_lng) {
		this.destiny_lng = destiny_lng;
	}

	public String getOrigin_name() {
		return origin_name;
	}

	public void setOrigin_name(String origin_name) {
		this.origin_name = origin_name;
	}

	public String getDestiny_name() {
		return destiny_name;
	}

	public void setDestiny_name(String destiny_name) {
		this.destiny_name = destiny_name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public AeroLine getAeroLine() {
		return aeroLine;
	}

	public void setAeroLine(AeroLine aeroLine) {
		this.aeroLine = aeroLine;
	}

	
}
