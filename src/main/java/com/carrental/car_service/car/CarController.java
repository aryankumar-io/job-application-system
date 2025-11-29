package com.carrental.car_service.car;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CarController {
    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public ResponseEntity<List<Car>> findAll() {
        return ResponseEntity.ok(carService.findAll());
    }

    @PostMapping("/cars")
    public ResponseEntity<String> createCar(@RequestBody Car car) {
        carService.createCar(car);
        return new ResponseEntity<>("Car Added Successfully", HttpStatus.CREATED);
    }

    @GetMapping("/cars/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable Long id) {
        Car car = carService.getCarById(id);
        if (car != null) {
            return new ResponseEntity<>(car, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/cars/{id}")
    public ResponseEntity<String> deleteCarById(@PathVariable Long id) {
        boolean deleted = carService.deleteCarById(id);

        if (deleted) {
            return new ResponseEntity<>("Car Deleted Successfully", HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/cars/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable Long id, @RequestBody Car updatedCar) {
        boolean updated = carService.updateCarById(id, updatedCar);

        if (updated) {
            return new ResponseEntity<>(updatedCar, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
