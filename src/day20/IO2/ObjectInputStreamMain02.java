package day20.IO2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamMain02 {

    public static void main(String[] args) {

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("./serial.ser"));

            Person p = (Person) ois.readObject();
            System.out.println(p);

        } catch (FileNotFoundException e) {
            System.out.println("[에러]" + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("[에러]" + e.getMessage());
        } catch (IOException e) {
            System.out.println("[에러]" + e.getMessage());
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
            }
        }
    }
}