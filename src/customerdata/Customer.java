package customerdata;

public class Customer {
    private String name;
    private String surname;
    private String patronymic;
    private String telephone;
    private Address address;
    private int idNumber;

    public Customer(String name, String surname, String patronymic, String telephone, Address address, int idNumber) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.telephone = telephone;
        this.address = address;
        this.idNumber = idNumber;
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

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
