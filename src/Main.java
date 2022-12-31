import data.*;
import operations.ConsoleIO;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        DataLists.initialiseLists();

        DataLists.readAllLists();

        // will be removed
        Car car = null;
        try {
            car = ConsoleIO.addCar();
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
        if (car != null)
            System.out.println(car.toString());
    }
}