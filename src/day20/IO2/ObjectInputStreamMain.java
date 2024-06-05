package day20.IO2;

import java.io.*;
import java.util.Arrays;

public class ObjectInputStreamMain {
    public static void main(String[] args) {

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("./serial.ser"));

            String[] names = (String[]) ois.readObject();
            int[] ages = (int[]) ois.readObject();
            double[] weights = (double[]) ois.readObject();

            System.out.println(Arrays.toString(names));
            System.out.println(Arrays.toString(ages));
            System.out.println(Arrays.toString(weights));

        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (ClassNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
            }
        }
    }
}
