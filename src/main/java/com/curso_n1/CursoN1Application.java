package com.curso_n1;

import java.math.BigDecimal;
import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.curso_n1.domain.entities.FlyEntity;
import com.curso_n1.domain.entities.HotelEntity;
import com.curso_n1.domain.repositories.ICustomerRepository;
import com.curso_n1.domain.repositories.IFlyRepository;
import com.curso_n1.domain.repositories.IHotelRepository;
import com.curso_n1.domain.repositories.IReservationRepository;
import com.curso_n1.domain.repositories.ITicketRepository;
import com.curso_n1.domain.repositories.ITourRepository;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
public class CursoN1Application implements CommandLineRunner {
	
	
	private final IHotelRepository hotelRepository;
	private final IFlyRepository flyRepository;
	private final ICustomerRepository customerRepository;
	private final IReservationRepository reservationRepository;
	private final ITicketRepository ticketRepository;
	private final ITourRepository tourRepository;
	
	public CursoN1Application(IHotelRepository hotelRepository, IFlyRepository flyRepository,
			ICustomerRepository customerRepository, IReservationRepository reservationRepository,
			ITicketRepository ticketRepository, ITourRepository tourRepository) {
		super();
		this.hotelRepository = hotelRepository;
		this.flyRepository = flyRepository;
		this.customerRepository = customerRepository;
		this.reservationRepository = reservationRepository;
		this.ticketRepository = ticketRepository;
		this.tourRepository = tourRepository;
	}

	private static final Logger log = LogManager.getLogger(CursoN1Application.class);

	
	
	
	public static void main(String[] args) {
		SpringApplication.run(CursoN1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		var fly = flyRepository.findById(15L).get();
//		var hotel = hotelRepository.findById(7L).get();
//		var ticket = ticketRepository.findById(UUID.fromString("12345678-1234-5678-2236-567812345678")).get();
//		
//		
//		log.info(String.valueOf(fly.getId()));
//		log.info(String.valueOf(hotel.getName()));
//		log.info(String.valueOf(ticket.getFly()));
//		log.info("vlidando....");
		
//		this.flyRepository.selectLessPrice(BigDecimal.valueOf(20))
//			.forEach(f -> System.out.println("Origen: "+f.getOrigin_name()+" precio: "+f.getPrice()));
//		
//		System.out.println("=========================================================\n");
//		
//		this.flyRepository
//			.selectBetweenPrice(BigDecimal.valueOf(10), BigDecimal.valueOf(13))
//			.forEach(f -> System.out.println("Origen: "+f.getOrigin_name()+" Precio: "+f.getPrice()));;
//
//		System.out.println("=========================================================\n");
//		
//		this.flyRepository
//			.selectOriginDestiny("Grecia", "Mexico")
//			.forEach(f -> System.out.println(f.getDestiny_lat()));
		
//		var fly = flyRepository.findByTicketId(UUID.fromString("12345678-1234-5678-2236-567812345678")).get();
//		System.out.println(fly.getAeroLine());
		
//		this.hotelRepository.findByPriceLessThan(BigDecimal.valueOf(70))
//			.forEach(h -> System.out.println(h.getName()));
		
//		hotelRepository.findByPriceBetween(BigDecimal.valueOf(100), BigDecimal.valueOf(150))
//			.forEach(h -> System.out.println(h.getName()));
		
//		hotelRepository.findByRatingGreaterThan(3)
//			.forEach(h -> System.out.println(h.getName()));
		
		var hotel = hotelRepository.findByReservationId(UUID.fromString("UUID-de-hotel"));
		System.out.println(hotel);
		
	}

}
