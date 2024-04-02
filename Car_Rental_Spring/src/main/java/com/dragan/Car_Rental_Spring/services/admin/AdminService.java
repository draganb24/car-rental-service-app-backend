package com.dragan.Car_Rental_Spring.services.admin;

import com.dragan.Car_Rental_Spring.dto.CarDto;

import java.io.IOException;
import java.util.List;

public interface AdminService {

    boolean postCar(CarDto carDto) throws IOException;

    List<CarDto> getAllCars();
}
