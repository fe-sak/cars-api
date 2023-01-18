package com.cars.api.controller;

import com.cars.api.dto.CarDTO;
import com.cars.api.model.Car;
import com.cars.api.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {

  @Autowired
  private CarRepository carRepository;

  @PostMapping
  public String create(@RequestBody CarDTO req) {
    Car newCar = new Car(req);

    carRepository.save(newCar);

    return "OK";
  }

}
