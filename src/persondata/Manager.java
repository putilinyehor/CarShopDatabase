package persondata;

public class Manager extends Person {
    private static int nextId = 0;

    protected float seniority;

    public Manager(String name, String surname, String patronymic, int birthDay, int birthMonth, int birthYear,
                   String telephone, String country, String city, int zipCode, String street,
                   String houseNumber, float seniority) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.setDateOfBirth(birthDay, birthMonth, birthYear);
        this.setTelephone(telephone);
        this.address = new Address(country, city, zipCode, street, houseNumber);
        this.seniority = seniority;
    }

    public Manager(String name, String surname, String patronymic, int[] dateOfBirth,
                   String telephone, Address address, float seniority) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.seniority = seniority;
        this.setTelephone(telephone);
        this.address = address;
    }

    /**
     * Returns a printable string with info about a manager
     * @return string, which represents all info about a manager
     */
    public String stringManagerInfo() {
        return  "Name: " + this.name + "\n" +
                "Surname: " + this.surname + "\n" +
                "Patronymic: " + this.patronymic + "\n" +
                "Date of Birth: " + this.stringDateOfBirth() + "\n" +
                "Telephone number: " + this.telephone + "\n" +
                "Address: \n" + this.address.stringAddressInfo() +
                "Seniority: " + this.seniority + "\n";
    }
}
