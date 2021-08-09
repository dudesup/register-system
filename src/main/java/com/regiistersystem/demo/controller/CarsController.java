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
    public void createCar(@RequestBody Car car) {
        carRepository.save(car);
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable("id") long id) {
        return carRepository.getById(id);

    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public void updateCar(@RequestBody Car car){
        Car carFromDB = carRepository.findById(car.getId()).orElseThrow(NullPointerException::new);
        carRepository.save(car);
        carFromDB.setEmail(car.getEmail());
        carFromDB.setPhone(car.getPhone());
        carFromDB.setModel(car.getModel());
        carFromDB.setVin(car.getVin());
        carFromDB.setPurchaseDate(car.getPurchaseDate());
        carFromDB.setPurchasePrice(car.getPurchasePrice());
        carFromDB.setContact(car.isContact());
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCar(@PathVariable("id") long id){
        carRepository.deleteById(id);
    }
}
