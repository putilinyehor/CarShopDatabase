package systemdata;

import cardata.Car;
import persondata.Customer;
import persondata.Manager;
import saledata.Sale;

import java.io.*;
import java.util.List;

public class InputOutput {
    private static final String directory = System.getProperty("user.dir");
    private static final String managersFileName = "savefiles" + File.separator + "managers.ser";
    private static final String customersFileName = "savefiles" + File.separator + "customers.ser";
    private static final String carsFileName = "savefiles" + File.separator + "cars.ser";
    private static final String salesFileName = "savefiles" + File.separator + "sales.ser";
    private static final String absolutePath = directory + File.separator; // + fileName !

    /**
     * Writes "managersList" array into "managers.ser" file
     * @return boolean: true if success, false if exception was caused
     */
    public static boolean writeManagersFile(List<Manager> managersList) {
        try {
            FileOutputStream writeData = new FileOutputStream(absolutePath + managersFileName);
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
            writeStream.writeObject(managersList);
            writeStream.flush();
            writeStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Writes "customersList" array into "customers.ser" file
     * @return boolean: true if success, false if exception was caused
     */
    public static boolean writeCustomersFile(List<Customer> customersList) {
        try {
            FileOutputStream writeData = new FileOutputStream(absolutePath + customersFileName);
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
            writeStream.writeObject(customersList);
            writeStream.flush();
            writeStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Writes "carsList" array into "cars.ser" file
     * @return boolean: true if success, false if exception was caused
     */
    public static boolean writeCarsFile(List<Car> carsList) {
        try {
            FileOutputStream writeData = new FileOutputStream(absolutePath + carsFileName);
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
            writeStream.writeObject(carsList);
            writeStream.flush();
            writeStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Writes "salesList" array into "sales.ser" file
     * @return boolean: true if success, false if exception was caused
     */
    public static boolean writeSalesFile(List<Sale> salesList) {
        try {
            FileOutputStream writeData = new FileOutputStream(absolutePath + salesFileName);
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
            writeStream.writeObject(salesList);
            writeStream.flush();
            writeStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Reads "managersList" array from "sales.ser" file
     * @return list "managersList"
     */
    public static List<Manager> readManagersFile() {
        List<Manager> managersList = null;
        try {
            FileInputStream readData = new FileInputStream(absolutePath + managersFileName);
            ObjectInputStream readStream = new ObjectInputStream(readData);
            managersList = (List<Manager>) readStream.readObject();
            readStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return managersList;
    }

    /**
     * Reads "customersList" array from "customers.ser" file
     * @return list "customersList"
     */
    public static List<Customer> readCustomersFile() {
        List<Customer> customersList = null;
        try {
            FileInputStream readData = new FileInputStream(absolutePath + customersFileName);
            ObjectInputStream readStream = new ObjectInputStream(readData);
            customersList = (List<Customer>) readStream.readObject();
            readStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return customersList;
    }

    /**
     * Reads "carsList" array from "cars.ser" file
     * @return list "carsList"
     */
    public static List<Car> readCarsFile() {
        List<Car> carsList = null;
        try {
            FileInputStream readData = new FileInputStream(absolutePath + carsFileName);
            ObjectInputStream readStream = new ObjectInputStream(readData);
            carsList = (List<Car>) readStream.readObject();
            readStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return carsList;
    }

    /**
     * Reads "salesList" array from "cars.ser" file
     * @return list "salesList"
     */
    public static List<Sale> readSalesFile() {
        List<Sale> salesList = null;
        try {
            FileInputStream readData = new FileInputStream(absolutePath + salesFileName);
            ObjectInputStream readStream = new ObjectInputStream(readData);
            salesList = (List<Sale>) readStream.readObject();
            readStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return salesList;
    }
}
