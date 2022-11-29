package systemdata;

import persondata.Manager;

import java.io.*;
import java.util.List;

public class InputOutput {
    private static final String directory = System.getProperty("user.dir");
    private static final String managersFileName = "managers.ser";
    private static final String customersFileName = "customers.ser";
    private static final String carsFileName = "managers.ser";
    private static final String absolutePath = directory + File.separator; // + fileName !

    /**
     *
     * @return
     */
    public static boolean writeManagersFile(List<Manager> managers) {
        try {
            FileOutputStream writeData = new FileOutputStream(absolutePath + managersFileName);
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
            writeStream.writeObject(managers);
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

    public static boolean writeCustomersFile() {
        return false;
    }

    public static boolean writeCarsFile() {
        return false;
    }

    /**
     *
     * @return
     */
    public static List<Manager> readManagersFile() {
        List<Manager> managers = null;
        try {
            FileInputStream readData = new FileInputStream(absolutePath + managersFileName);
            ObjectInputStream readStream = new ObjectInputStream(readData);
            managers = (List<Manager>) readStream.readObject();
            readStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return managers;
    }

    public static boolean readCustomersFile() {
        return false;
    }

    public static boolean readCarsFile() {

        return false;
    }
}
