package com.improving.service.booking.controller;

import com.improving.service.booking.Utilities.ApplicationAppValues;
import com.improving.service.booking.model.dao.BookingDao;
import com.improving.service.booking.service.BookingService;
import org.springframework.boot.test.mock.mockito.MockBean;

public abstract class AbstractControllerTest {

    @MockBean
    public BookingDao bookingDao;

    @MockBean
    public BookingService bookingService;

    @MockBean
    public ApplicationAppValues applicationAppValues;

}
