package cardata;

import persondata.Manager;

import java.io.Serializable;

public class Car implements Serializable {
    private int id;
    private static int nextID;
    private String name;
    private String brand;
    private int year;
    private DrivetrainType drivetrainType;
    private float price; // TODO: Default currency - EURO, make functions for USD, etc.
    private Manager manager;
    boolean isSold;

    public Car(String name, String brand, int year, DrivetrainType drivetrainType, float price, Manager manager) {
        this.id = nextID;
        nextID++;
        this.name = name;
        this.brand = brand;
        this.year = year;
        this.drivetrainType = drivetrainType;
        this.price = price;
        this.manager = manager;
        isSold = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        Car.nextID = nextID;
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

    public DrivetrainType getDrivetrainType() {
        return drivetrainType;
    }

    public void setDrivetrainType(DrivetrainType drivetrainType) {
        this.drivetrainType = drivetrainType;
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

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    @Override
    public String toString() {
        return  "ID: " + this.id + "\n" +
                "Name: " + this.name + "\n" +
                "Brand: " + this.brand + "\n" +
                "Year: " + this.year + "\n" +
                "Drivetrain type: " + this.drivetrainType + "\n" +
                "Price: " + this.price + "\n" +
                "Manager: " + "\n" +
                "\tName: " + this.manager.getName() + "\n" +
                "\tSurname: " + this.manager.getSurname() + "\n";
    }
}