package com.improving.service.booking.utilities;

import com.improving.service.booking.model.dto.BookingDto;

import java.util.ArrayList;
import java.util.List;

public class DummyData {

    public static List<BookingDto> getDummyReservationList(){
        List<BookingDto> dummyData = new ArrayList<>();
        BookingDto dto = new BookingDto();
        dto.setId(1);
        dto.setName("dummy name");
        dto.setTime("2020-07-09 11:58:23.08596");

        dummyData.add(dto);

        return dummyData;
    }

}
