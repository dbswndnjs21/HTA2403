package day19.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOEx01 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("./text2.txt");

            int data = 0;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
            }
        }

    }
}
