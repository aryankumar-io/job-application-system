package com.carrental.car_service.car;

import java.util.List;

public interface CarService {
    List<Car> findAll();
    void createCar(Car car);

    Car getCarById(Long id);

    boolean deleteCarById(Long id);

    boolean updateCarById(Long id, Car updatedCar);
}
