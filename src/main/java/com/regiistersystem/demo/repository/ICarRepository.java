package com.regiistersystem.demo.repository;

import com.regiistersystem.demo.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarRepository extends JpaRepository<Car, Long> {
}
