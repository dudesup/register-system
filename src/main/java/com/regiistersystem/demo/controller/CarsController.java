package com.regiistersystem.demo.controller;

import com.regiistersystem.demo.model.Car;
import com.regiistersystem.demo.repository.ICarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cars")
public class CarsController {
    @Autowired
    private ICarRepository carRepository;

    @GetMapping
    public List<Car> carList() {
        return carRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Car car) {
        carRepository.save(car);
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable("id") long id) {
        return carRepository.getById(id);

    }
}
