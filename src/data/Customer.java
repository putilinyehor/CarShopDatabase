package data;

public class Customer extends Person{
    private static int nextId = 0;
    public Customer(String name, String surname, String patronymic, int birthDay, int birthMonth, int birthYear,
                    String telephone, String country, String city, int zipCode, String street, String houseNumber) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.setDateOfBirth(birthDay, birthMonth, birthYear);
        this.setTelephone(telephone);
        this.address = new Address(country, city, zipCode, street, houseNumber);
    }

    public Customer(String name, String surname, String patronymic, int[] dateOfBirth, String telephone,
                    Address address) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.setTelephone(telephone);
        this.address = address;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Customer.nextId = nextId;
    }

    @Override
    public String toString() {
        return  "ID: " + this.id + "\n" +
                "Name: " + this.name + "\n" +
                "Surname: " + this.surname + "\n" +
                "Patronymic: " + this.patronymic + "\n" +
                "Date of Birth: " + this.stringDateOfBirth() + "\n" +
                "Telephone number: " + this.telephone + "\n" +
                "Address: \n" + this.address.toString();
    }
}
