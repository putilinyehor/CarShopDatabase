package data;

import operations.FileIO;

import java.util.ArrayList;
import java.util.List;

public class DataLists {
    private static List<Manager> managersList;
    private static List<Customer> customersList;
    private static List<Car> carsList;
    private static List<Sale> salesList;


    public static List<Manager> getManagersList() {
        return managersList;
    }

    public static List<Customer> getCustomersList() {
        return customersList;
    }

    public static List<Car> getCarsList() {
        return carsList;
    }

    public static List<Sale> getSalesList() {
        return salesList;
    }


    public static void initialiseLists() {
        managersList = new ArrayList<>();
        customersList = new ArrayList<>();
        carsList = new ArrayList<>();
        salesList = new ArrayList<>();
    }

    // TODO: make it boolean to check the return values
    public static void writeAllLists() {
        FileIO.writeManagersFile(managersList);
        FileIO.writeCustomersFile(customersList);
        FileIO.writeCarsFile(carsList);
        FileIO.writeSalesFile(salesList);
    }


    // TODO: make it boolean to check the return values
    public static void readAllLists() {
        managersList = FileIO.readManagersFile();
        customersList = FileIO.readCustomersFile();
        carsList = FileIO.readCarsFile();
        salesList = FileIO.readSalesFile();
    }

    public static void printAllLists() {

        for (Manager m : managersList)
            System.out.println(m.toString());
        System.out.println("*************************");

        for (Customer c : customersList)
            System.out.println(c.toString());
        System.out.println("*************************");

        for (Car c : carsList)
            System.out.println(c.toString());
        System.out.println("*************************");

        for (Sale s : salesList)
            System.out.println(s.toString());
        System.out.println("*************************");
    }
}
