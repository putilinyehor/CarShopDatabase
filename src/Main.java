import cardata.Car;
import cardata.DrivetrainType;
import persondata.Address;
import persondata.Customer;
import persondata.Manager;
import systemdata.InputOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Lists initialisation
    List<Manager> managersList = new ArrayList<Manager>();
    List<Customer> customersList = new ArrayList<Customer>();
    List<Car> carsList = new ArrayList<Car>();

    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        Address addressTemplate1 = new Address("Germany", "Hamburg", 23505, "Kalkbrennerstr.", "5a");
        Address addressTemplate2 = new Address("Poland", "Warsaw", 46779, "Some street.", "4b");
        int [] dateOfBirth = {23, 5, 2004};
        Manager managerTemplate = new Manager("Joseph", "Seed", "Stark", dateOfBirth, "1238712731784", addressTemplate1, 2.2F);
        Customer customerTemplate = new Customer("John", "Ares", "The Mighty", dateOfBirth, "223588564856", addressTemplate2);
        Car carTemplate = new Car("Mercedes-Benz GLC 250", "Mercedes-Benz", 2016, DrivetrainType.AWD, 35000, managerTemplate);
        //System.out.println(managerTemplate.stringManagerInfo());
        //System.out.println(carTemplate.stringCarInfo());
        //System.out.println(customerTemplate.stringCustomerInfo());

        InputOutput.writeManagersFile();
        InputOutput.readManagersFile();

    }
}
