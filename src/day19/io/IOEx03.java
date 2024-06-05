package day19.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOEx03 {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("./text2.txt"));

//            int data = 0;
//            while ((data = br.read()) != -1) {
//                System.out.println((char) data);
//            }
            String data = null;
            while ((data = br.readLine()) != null ) { // 엔터키까지 읽음 readLine은
                System.out.print(data);
            }

        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
            }
        }
    }
}

