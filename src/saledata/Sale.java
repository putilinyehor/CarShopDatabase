package saledata;

import cardata.Car;
import persondata.Customer;

import java.io.Serializable;
import java.util.Arrays;

public class Sale implements Serializable {
    private int id;
    private static int nextId = 0;
    private Car car; // Manager inside
    private Customer customer;
    private int[] dateOfSale;
    private String additionalInformation; // if present

    public Sale(Car car, Customer customer, int[] dateOfSale) {
        this.id = nextId;
        nextId++;
        this.car = car;
        this.customer = customer;
        this.dateOfSale = dateOfSale;
    }

    public Sale(Car car, Customer customer, int[] dateOfSale, String additionalInformation) {
        this.id = nextId;
        nextId++;
        this.car = car;
        this.customer = customer;
        this.dateOfSale = dateOfSale;
        this.additionalInformation = additionalInformation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Sale.nextId = nextId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int[] getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(int[] dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    /**
     * Prints out Date of Birth of a manager (with slash)
     *
     * @return String, which represents date of birth
     */
    public String stringDateOfSale() {
        return this.dateOfSale[0] +
                "/" + this.dateOfSale[1] + "/" + this.dateOfSale[2];
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    @Override
    public String toString() {
        return  "ID: " + this.id + "\n" +
                "Car:\n" + "\t" + this.car.toString() +
                "Customer: " + this.customer.toString() +
                "Date of sale: " + this.stringDateOfSale() + "\n" +
                "AdditionalInformation: " + this.additionalInformation + '\n';
    }
}
