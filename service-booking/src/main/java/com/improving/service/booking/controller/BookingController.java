package com.improving.service.booking.controller;

import static com.improving.service.booking.Utilities.ApplicationConstants.URL_RESERVATIONS;

import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.improving.service.booking.Utilities.ApplicationAppValues;
import com.improving.service.booking.model.dto.BaseResponse;
import com.improving.service.booking.service.BookingService;

@RestController
@RequestMapping(value = URL_RESERVATIONS)
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	@Autowired
	private ApplicationAppValues appValues;

    /**
     * Get reservation list.
     * @return baseResponse.
     */
	@ApiOperation("Get reservation list.")
	@GetMapping
	public ResponseEntity<BaseResponse> getReservationList() {
		
		BaseResponse response = new BaseResponse(
				HttpStatus.OK.value(),
				appValues.getAllSuccessMessage(),
				bookingService.getAll(),
				StringUtils.EMPTY);
		
		return new ResponseEntity<BaseResponse>(response, HttpStatus.OK);
	}

}
