package com.improving.service.booking.service;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import com.improving.service.booking.model.dto.BookingDto;
import com.improving.service.booking.utilities.DummyData;
import com.improving.service.booking.utilities.MockitoInitializer;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import java.util.List;

public class BookingServiceTest extends MockitoInitializer {

    @Mock
    private BookingService bookingService;

    @Test
    public void getAllTest(){
        when(bookingService.getAll()).thenReturn(DummyData.getDummyReservationList());

        List<BookingDto> response = bookingService.getAll();

        assertNotNull(response);
    }


}
