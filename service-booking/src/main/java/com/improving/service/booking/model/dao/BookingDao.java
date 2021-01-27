package com.improving.service.booking.model.dao;

import com.improving.service.booking.model.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDao extends JpaRepository<Booking, Long> {

}
