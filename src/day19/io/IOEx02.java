package day19.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx02 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("./text2.txt");

            fw.write("Hello");
            fw.write("World");
            fw.write("\n");
            fw.write("Hello");
            fw.write("World");

            System.out.println("출력 완료");

        } catch (IOException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
            }
        }

    }
}
