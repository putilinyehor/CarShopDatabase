import cardata.Car;
import managerdata.Manager;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    public static void main(String[] args) {
        // Car carTemplate = new Car();
        scanner = new Scanner(System.in);
        String telephone = "1";
        if (telephone.matches("[0-9]+")) {
            System.out.println("eblan");
        }
        // Manager managerTemplate = new Manager("Joseph", "Seed", "Stark", 23, 12, 2000, 2.1F, telephoneNumber);
        // managerTemplate.printDateOfBirth();
        // System.out.println(managerTemplate.stringManagerInfo());
    }
}
