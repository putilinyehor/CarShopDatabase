import cardata.Car;
import cardata.DrivetrainType;
import persondata.Address;
import persondata.Customer;
import persondata.Manager;
import saledata.Sale;
import systemdata.InputOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Lists initialisation
    private static List<Manager> managersList = new ArrayList<>();
    private static List<Customer> customersList = new ArrayList<>();
    private static List<Car> carsList = new ArrayList<>();
    private static List<Sale> salesList = new ArrayList<>();

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

        managersList.add(managerTemplate);
        managersList.add(managerTemplate);

        InputOutput.writeManagersFile(managersList);
        managersList = InputOutput.readManagersFile();
        for (Manager m : managersList)
            System.out.println(m.stringManagerInfo());
    }
}
