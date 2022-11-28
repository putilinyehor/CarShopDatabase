import cardata.Car;
import cardata.DrivetrainType;
import managerdata.Manager;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        Manager managerTemplate = new Manager("Joseph", "Seed", "Stark", 23, 12,
                2000, 2.1F, "493886845763475");
        Car carTemplate = new Car("Mercedes-Benz GLC 250", "Mercedes-Benz", 2016, DrivetrainType.AWD, 35000, managerTemplate);

    }
}
