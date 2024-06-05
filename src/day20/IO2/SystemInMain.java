package day20.IO2;

import java.io.IOException;
import java.io.InputStream;

public class SystemInMain {
    public static void main(String[] args) {
        InputStream is = null;
        
        //프로그램 시작과 동시에 생성

        try {
            is = System.in;

            System.out.println("입력 > ");
            System.out.println((char) is.read());
            System.out.println((char) is.read());
            System.out.println((char) is.read());
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
            }
        }
    }
}
