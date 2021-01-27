package com.improving.service.booking.service.impl;

import static com.improving.service.booking.Utilities.ApplicationConstants.REPLACE_T_SPACE;
import static com.improving.service.booking.Utilities.ApplicationConstants.REPLACE_T_CHARACTER;

import java.util.List;
import java.util.stream.Collectors;

import com.improving.service.booking.model.dto.BookingDto;
import com.improving.service.booking.model.dao.BookingDao;
import com.improving.service.booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingDao bookingDao;

	@Override
	public List<BookingDto> getAll() {

		return bookingDao.findAll().stream().map(item -> {
		    BookingDto dto = new BookingDto();
		    dto.setId(Math.toIntExact(item.getId()));
		    dto.setName(item.getName());
		    dto.setTime(item.getTime().toString().replace(REPLACE_T_CHARACTER, REPLACE_T_SPACE));
		    return dto;
        }).collect(Collectors.toList());
	}

}
