package operations;

import data.Car;
import data.DataLists;
import data.DrivetrainType;
import data.Manager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleIO {
    private static final Scanner scanner = new Scanner(System.in);
    // class for printing functions
    public static Car addCar() throws InputMismatchException {
        System.out.println(ANSICodes.yellow + "Adding a Car with ID " + ANSICodes.blue + Car.getNextID() + ANSICodes.rst);

        System.out.print("Model name: ");
        String name = scanner.next();

        System.out.print("Brand name: ");
        String brand = scanner.next();

        System.out.print("Year of issue: ");
        int year = scanner.nextInt();

        int ch = -1;
        String drivetrain = "";
        while (drivetrain.equalsIgnoreCase("")) {
            System.out.print("Choose drivetrain type:\n" + "\t1 - AWD\n" + "\t2 - FWD\n" + "\t3 - RWD\n");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    drivetrain = "AWD";
                    break;
                case 2:
                    drivetrain = "FWD";
                    break;
                case 3:
                    drivetrain = "RWD";
                    break;
                default:
                    System.out.println("You entered a wrong number, enter the value again: ");
                    break;
            }
        }

        System.out.print("Price (in Euro): ");
        int price = scanner.nextInt();

        Manager manager = null;
        System.out.println("Choose Manager: ");
        System.out.println("\t1 - choose an existing Manager by ID");
        System.out.println("\t2 - choose an existing Manager by Name");
        System.out.println("\t3 - choose an existing Manager by Surname");
        System.out.println("\t4 - EXPERIMENTAL: no Manager");
        System.out.println("\tIf you don't have a manager yet, enter any other number and create one from the menu.");
        ch = scanner.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Enter Manager's ID: ");
                int id = scanner.nextInt();
                for (Manager m : DataLists.getManagersList()) {
                    if (m.getId() == id) {
                        System.out.println("...Manager found and added.");
                        manager = m;
                    }
                }
                break;
            case 2:
                System.out.print("Enter Manager's Name: ");
                String managerName = scanner.next();
                for (Manager m : DataLists.getManagersList()) {
                    if (m.getName().equalsIgnoreCase(managerName)) {
                        System.out.println("...Manager found and added.");
                        manager = m;
                    }
                }
                break;
            case 3:
                System.out.print("Enter Manager's Surname: ");
                String managerSurname = scanner.next();
                for (Manager m : DataLists.getManagersList()) {
                    if (m.getSurname().equalsIgnoreCase(managerSurname)) {
                        System.out.println("...Manager found and added.");
                        manager = m;
                    }
                }
                break;
            case 4:
                System.out.println("Empty manager will be created.");
                break;
            default:
                System.out.println("You choose to return and create manager.");
                return null;
        }

        return new Car(name, brand, year, DrivetrainType.valueOf(drivetrain), price, manager);
    }
}
