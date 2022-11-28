package cardata;

import managerdata.Manager;

public class Car {
    private String name;
    private String brand;
    private int year;
    private float engineCapacity;
    private String carType;
    private float price;
    private Manager manager;

    public Car(String name, String brand, int year, float engineCapacity, String carType, float price, Manager manager) {
        this.name = name;
        this.brand = brand;
        this.year = year;
        this.engineCapacity = engineCapacity;
        this.carType = carType;
        this.price = price;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
