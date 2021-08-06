package com.regiistersystem.demo.controller;

import com.regiistersystem.demo.model.Car;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/cars")
public class CarsController {
    @GetMapping
    public List<Car> carList(){
        List<Car> cars = new ArrayList<>();
        return cars;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Car car){
        carList().add(new Car());
    }
    @GetMapping("/{id}")
    public Car getCarById(@PathVariable("id") long id){
        return new Car();
    }
}
