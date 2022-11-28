package systemdata;

import java.io.*;

public class InputOutput {
    private static String directory = System.getProperty("user.dir");
    private static String managersFileName = "managers.txt";
    private static String customersFileName = "customers.txt";
    private static String carsFileName = "managers.txt";
    private static String absolutePath = directory + File.separator; // + fileName !

    /**
     *
     * @return
     */
    public static boolean writeManagersFile() {
        try (FileWriter fileWriter = new FileWriter(absolutePath + managersFileName)) {
            String fileContent = "Simple text";
            fileWriter.write(fileContent);
            fileWriter.close();
        } catch (IOException e) {
            // Handle exception
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
    public static boolean readManagersFile() {
        try {
            FileWriter fileWriter = new FileWriter("MyFile.txt", true);
            fileWriter.write("Hello World");
            fileWriter.write("\r\n");   // write new line
            fileWriter.write("Good Bye!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    } // TODO: fucked up function

    public static boolean readCustomersFile() {
        return false;
    }

    public static boolean readCarsFile() {

        return false;
    }
}
