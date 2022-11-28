package managerdata;

public class Manager {
    private String name;
    private String surname;
    private String patronymic;
    private int[] dateOfBirth; // day, month, year
    private float seniority;
    private String telephone;

    public Manager(String name, String surname, String patronymic, int birthDay, int birthMonth, int birthYear, float seniority, String telephone) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        setDateOfBirth(birthDay, birthMonth, birthYear);
        this.seniority = seniority;
        setTelephone(telephone);
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

    public float getSeniority() {
        return seniority;
    }

    public void setSeniority(float seniority) {
        this.seniority = seniority;
    }

    public String getTelephone() {
        return telephone;
    }

    /**
     * Returns TRUE if the telephone input was correct and FALSE in case it isn't
     * @param telephone String telephone number (in case it's a big one, for some reason)
     * @return Returns TRUE if telephone was correct
     */
    public boolean setTelephone(String telephone) {
        if (telephone.matches("[0-9]+")) {
            this.telephone = telephone;
            return true;
        }
        return false;
    }

    /**
     * Returns a printable string with info about a manager
     * @return string, which represents all info about a manager
     */
    public String stringManagerInfo() {
        return  "Name: " + this.name + "\n" +
                "Surname: " + this.surname + "\n" +
                "Patronymic: " + this.patronymic + "\n" +
                "Date of Birth: " + stringDateOfBirth() + "\n" +
                "Seniority: " + this.seniority + "\n" +
                "Telephone number:" + this.telephone + "\n";
    }
}
