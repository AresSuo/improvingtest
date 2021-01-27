package com.improving.service.booking.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.mockito.Mockito.when;

import com.improving.service.booking.utilities.DummyData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;

import static com.improving.service.booking.Utilities.ApplicationConstants.URL_RESERVATIONS;

@WebMvcTest(BookingController.class)
@AutoConfigureMockMvc(addFilters = false)
public class BookingControllerTest extends AbstractControllerTest{

    @Autowired
    private MockMvc mvc;

    @Test
    public void getReservationListTest() throws Exception {

        when(applicationAppValues.getAllSuccessMessage()).thenReturn("Booking list retrieved successfully.");
        when(bookingService.getAll()).thenReturn(DummyData.getDummyReservationList());

        mvc.perform(get(URL_RESERVATIONS))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value(200))
                .andExpect(jsonPath("message").value("Booking list retrieved successfully."))
                .andExpect(jsonPath("data").isArray())
                .andExpect(jsonPath("data.[0].id").exists());

    }
}
