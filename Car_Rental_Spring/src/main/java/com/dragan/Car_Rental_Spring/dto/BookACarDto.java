package com.dragan.Car_Rental_Spring.dto;

import com.dragan.Car_Rental_Spring.enums.BookCarStatus;
import lombok.Data;

import java.util.Date;

@Data
public class BookACarDto {

    private Long id;

    private Date fromDate;

    private Date toDate;

    private Long days;

    private BookCarStatus bookCarStatus;

    private Long carId;

    private Long userId;

    private String username;

    private String email;

    private Long price;
}
