package com.dragan.Car_Rental_Spring.services.customer;

import com.dragan.Car_Rental_Spring.dto.BookACarDto;
import com.dragan.Car_Rental_Spring.dto.CarDto;

import java.util.List;

public interface CustomerService {

    List<CarDto> getAllCars();

    boolean bookACar(Long carId, BookACarDto bookACarDto);

    CarDto getCarById(Long carId);

    List<BookACarDto> getBookingsByUserId(Long userId);
}
