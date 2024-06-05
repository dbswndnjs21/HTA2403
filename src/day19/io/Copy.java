package day19.io;

import java.io.*;

public class Copy {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("./image1.jpg");
            fos = new FileOutputStream("./image2.jpg");

            int data = 0;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
            }
            try {
                fis.close();
            } catch (IOException e) {
            }
        }

        System.out.println("복사 완료");
    }
}
