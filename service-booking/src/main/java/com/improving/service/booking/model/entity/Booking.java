package com.improving.service.booking.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static com.improving.service.booking.Utilities.ApplicationConstants.EntityConstants.BOOKING_NAME_COLUMN;
import static com.improving.service.booking.Utilities.ApplicationConstants.EntityConstants.BOOKING_DATE_TIME_COLUMN;
import static com.improving.service.booking.Utilities.ApplicationConstants.EntityConstants.BOOKING_TABLE;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = BOOKING_TABLE)
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = BOOKING_NAME_COLUMN)
    String name;

    @Column(name = BOOKING_DATE_TIME_COLUMN)
    LocalDateTime time;

}
