package com.improving.service.booking;

import com.improving.service.booking.Utilities.MapUtilitie;
import com.improving.service.booking.model.dao.BookingDao;
import com.improving.service.booking.model.dto.BookingDto;
import com.improving.service.booking.model.entity.Booking;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServiceBookingApplication implements  CommandLineRunner{

	@Autowired
	private BookingDao dao;

	public static void main(String[] args) {
		SpringApplication.run(ServiceBookingApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        dao.saveAll(MapUtilitie.mapJsonToEntity());
    }
}
