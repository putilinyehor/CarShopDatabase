package persondata;

import java.io.Serializable;

public class Address implements Serializable {
    private String country;
    private String city;
    private int zipCode;
    private String street;
    private String houseNumber;

    public Address(String country, String city, int zipCode, String street, String houseNumber) {
        this.country = country;
        this.city = city;
        this.zipCode = zipCode;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return  "\tCountry: " + this.country + "\n" +
                "\tCity: " + this.city + "\n" +
                "\tZip code: " + this.zipCode + "\n" +
                "\tStreet: " + this.street + "\n" +
                "\tHouse number: " + this.houseNumber + "\n";
    }
}
