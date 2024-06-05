    package day19.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IoMain04 {
    public static void main(String[] args) {
        //FileInputStream fis = null;
        BufferedInputStream bis = null;

        try {
            //fis = new FileInputStream("./test4.txt");
            bis = new BufferedInputStream(new FileInputStream("./test4.txt")); // 직접 파일명 못집어넣음 FileInputStream 을 넣어줘야함

            int data = 0;

            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                bis.close();
            } catch (IOException e) {
            }
//            try {
//                fis.close();
//            } catch (IOException e) {
//            }
        }
    }
}
