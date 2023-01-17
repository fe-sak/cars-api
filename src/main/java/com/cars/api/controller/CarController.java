package com.cars.api.controller;

import com.cars.api.dto.CarDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {

  @PostMapping
  public void create(@RequestBody CarDTO req) {
    System.out.println("valor: "+req.valor());
    System.out.println("modelo: "+req.modelo());
  }

}
