package saledata;

import cardata.Car;
import persondata.Customer;

public class Sale {
    private Car car; // Manager included in car class
    private Customer customer;
    private int[] dateOfSale;
    private String additionalInformation; // if present

    public Sale(Car car, Customer customer, int[] dateOfSale) {
        this.car = car;
        this.customer = customer;
        this.dateOfSale = dateOfSale;
    }

    public Sale(Car car, Customer customer, int[] dateOfSale, String additionalInformation) {
        this.car = car;
        this.customer = customer;
        this.dateOfSale = dateOfSale;
        this.additionalInformation = additionalInformation;
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
}
