package day20.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOMain01 {
    public static void main(String[] args) {
//        FileInputStream fis = null;
        InputStream fis = null; // 다형성
        try {
            fis = new FileInputStream("./test1.txt");

            int data = 0;
            while ((data = fis.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
            }
        }
    }
}
