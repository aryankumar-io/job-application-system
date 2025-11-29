package com.carrental.car_service.car.impl;

import com.carrental.car_service.car.Car;
import com.carrental.car_service.car.CarService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();
    private long nextId = 1L;

    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public void createCar(Car car) {
        car.setId(nextId++);
        cars.add(car);
    }

    @Override
    public Car getCarById(Long id) {
        for (Car car : cars) {
            if (car.getId().equals(id)) {
                return car;
            }
        }
        return null;
    }

    @Override
    public boolean deleteCarById(Long id) {
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            if (car.getId().equals(id)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateCarById(Long id, Car updatedCar) {
        for (Car car : cars) {
            if (car.getId().equals(id)) {

                car.setBrandName(updatedCar.getBrandName());
                car.setModelName(updatedCar.getModelName());
                car.setDescription(updatedCar.getDescription());
                car.setYear(updatedCar.getYear());
                car.setType(updatedCar.getType());
                car.setRegistrationNumber(updatedCar.getRegistrationNumber());
                car.setFuelType(updatedCar.getFuelType());
                car.setSeats(updatedCar.getSeats());
                car.setPricePerDay(updatedCar.getPricePerDay());
                car.setStatus(updatedCar.getStatus());
                car.setMileage(updatedCar.getMileage());
                car.setTransmission(updatedCar.getTransmission());
                car.setColor(updatedCar.getColor());
                car.setLocation(updatedCar.getLocation());
                car.setGpsEnabled(updatedCar.isGpsEnabled());
                car.setAirConditioned(updatedCar.isAirConditioned());
                car.setImageUrl(updatedCar.getImageUrl());
                car.setInsuranceNumber(updatedCar.getInsuranceNumber());
                car.setInsuranceExpiry(updatedCar.getInsuranceExpiry());
                car.setLateReturnFeePerHour(updatedCar.getLateReturnFeePerHour());

                return true; // Update successful
            }
        }
        return false; // Car not found
    }

}
