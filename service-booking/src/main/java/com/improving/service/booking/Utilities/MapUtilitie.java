package com.improving.service.booking.Utilities;

import com.improving.service.booking.model.entity.Booking;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MapUtilitie {

    public static List<Booking> mapJsonToEntity(){
        List<Booking> bookingList = new ArrayList<>();
        JSONParser jsonParser = new JSONParser();

        try(FileReader reader = new FileReader("./src/main/resources/DemoData.json")){

            Object obj = jsonParser.parse(reader);

            JSONArray bookings = (JSONArray) obj;

            bookings.forEach(booking -> bookingList.add(parseBooking((JSONObject)booking)));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return bookingList;
    }

    private static Booking parseBooking(JSONObject bookingData) {
        Booking booking = new Booking();

        booking.setId((Long) bookingData.get("id"));
        booking.setName((String) bookingData.get("name"));
        booking.setTime(LocalDateTime.parse((CharSequence) bookingData.get("time")));

        return booking;
    }

}
