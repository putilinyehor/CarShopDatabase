package customerdata;

public class Customer {
    private static int nextId = 0;
    private int id; // TODO: implement a system to increment ID, when running a program every time (read/write file)
    private String name;
    private String surname;
    private String patronymic;
    private String telephone;
    private Address address;

    public Customer(String name, String surname, String patronymic, String telephone, Address address) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.telephone = telephone;
        this.address = address;
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
