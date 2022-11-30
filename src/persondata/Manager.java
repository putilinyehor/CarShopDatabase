package persondata;

public class Manager extends Person {
    private static int nextId = 0;
    private float seniority;

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

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Manager.nextId = nextId;
    }

    public float getSeniority() {
        return seniority;
    }

    public void setSeniority(float seniority) {
        this.seniority = seniority;
    }

    @Override
    public String toString() {
        return  "ID: " + this.id + "\n" +
                "Name: " + this.name + "\n" +
                "Surname: " + this.surname + "\n" +
                "Patronymic: " + this.patronymic + "\n" +
                "Date of Birth: " + this.stringDateOfBirth() + "\n" +
                "Telephone number: " + this.telephone + "\n" +
                "Address: \n" + this.address.toString() +
                "Seniority: " + this.seniority + "\n";
    }
}
