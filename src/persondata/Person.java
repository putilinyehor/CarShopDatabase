package persondata;

import java.io.Serializable;

public class Person implements Serializable {
    protected int id;
    protected String name;
    protected String surname;
    protected String patronymic;
    protected int[] dateOfBirth; // day, month, year
    protected String telephone;
    protected Address address;

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

    public int[] getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Prints out Date of Birth of a manager (with slash)
     *
     * @return String, which represents date of birth
     */
    public String stringDateOfBirth() {
        return this.dateOfBirth[0] +
                "/" + this.dateOfBirth[1] + "/" + this.dateOfBirth[2];
    }

    public void setDateOfBirth(int[] dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Converts params to an array, that represents dateOfBirth
     *
     * @param day
     * @param month
     * @param year
     */
    public void setDateOfBirth(int day, int month, int year) {
        this.dateOfBirth = new int[] {day, month, year};
    }

    public String getTelephone() {
        return telephone;
    }

    /**
     * Returns TRUE if the telephone input was correct and FALSE in case it isn't
     * @param telephone String telephone number (in case it's a big one, for some reason)
     * @return Returns TRUE if telephone was correct
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public static boolean isTelephoneFormatted(String telephone) {
        if (telephone.matches("[0-9]+"))
            return true;
        return false;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
