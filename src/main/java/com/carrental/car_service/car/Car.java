package com.carrental.car_service.car;
import java.time.LocalDate;

public class Car {
    private Long id;
    private String brandName;
    private String modelName;
    private String description;
    private int year;
    private String type;
    private String registrationNumber;
    private String fuelType;
    private int seats;
    private double pricePerDay;
    private String status;
    private double mileage;
    private String transmission;
    private String color;
    private String location;
    private boolean gpsEnabled;
    private boolean airConditioned;
    private String imageUrl;
    private String insuranceNumber;
    private LocalDate insuranceExpiry;
    private double lateReturnFeePerHour;

    public Car(Long id, String brandName, String modelName, String description, int year, String type, String registrationNumber, String fuelType, int seats, double pricePerDay, String status, double mileage, String transmission, String color, String location, boolean gpsEnabled, boolean airConditioned, String imageUrl, String insuranceNumber, LocalDate insuranceExpiry, double lateReturnFeePerHour) {
        this.id = id;
        this.brandName = brandName;
        this.modelName = modelName;
        this.description = description;
        this.year = year;
        this.type = type;
        this.registrationNumber = registrationNumber;
        this.fuelType = fuelType;
        this.seats = seats;
        this.pricePerDay = pricePerDay;
        this.status = status;
        this.mileage = mileage;
        this.transmission = transmission;
        this.color = color;
        this.location = location;
        this.gpsEnabled = gpsEnabled;
        this.airConditioned = airConditioned;
        this.imageUrl = imageUrl;
        this.insuranceNumber = insuranceNumber;
        this.insuranceExpiry = insuranceExpiry;
        this.lateReturnFeePerHour = lateReturnFeePerHour;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isGpsEnabled() {
        return gpsEnabled;
    }

    public void setGpsEnabled(boolean gpsEnabled) {
        this.gpsEnabled = gpsEnabled;
    }

    public boolean isAirConditioned() {
        return airConditioned;
    }

    public void setAirConditioned(boolean airConditioned) {
        this.airConditioned = airConditioned;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public LocalDate getInsuranceExpiry() {
        return insuranceExpiry;
    }

    public void setInsuranceExpiry(LocalDate insuranceExpiry) {
        this.insuranceExpiry = insuranceExpiry;
    }

    public double getLateReturnFeePerHour() {
        return lateReturnFeePerHour;
    }

    public void setLateReturnFeePerHour(double lateReturnFeePerHour) {
        this.lateReturnFeePerHour = lateReturnFeePerHour;
    }
}
