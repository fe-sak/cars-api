package com.cars.api.model;

import com.cars.api.dto.CarDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Car {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 30, nullable = false)
  private String modelo;

  @Column(length = 30, nullable = false)
  private String fabricante;

  @Column(length = 30, nullable = false)
  private String dataFabricacao;

  @Column(length = 30, nullable = false)
  private String valor;

  @Column(length = 30, nullable = false)
  private String anoModelo;

  public Car(CarDTO carDTO){
    this.setModelo(carDTO.modelo());
    this.setFabricante(carDTO.fabricante());
    this.setDataFabricacao(carDTO.dataFabricacao());
    this.setValor(carDTO.valor());
    this.setAnoModelo(carDTO.anoModelo());
  }

}
