package day19.io;

import java.io.*;

public class Copy02 {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream("./image1.jpg"));
            bos = new BufferedOutputStream(new FileOutputStream("./image2.jpg"));

            int data = 0;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                bis.close();
            } catch (IOException e) {
            }
            try {
                bos.close();
            } catch (IOException e) {
            }
        }

        System.out.println("복사 완료");
    }
}
