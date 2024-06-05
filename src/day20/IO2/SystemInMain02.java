package day20.IO2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInMain02 {
    public static void main(String[] args) {
        InputStreamReader isr = null;
        

        try {
            isr = new InputStreamReader(System.in);

            System.out.println("입력 > ");
            System.out.println((char) isr.read());
            System.out.println((char) isr.read());
            System.out.println((char) isr.read());
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                isr.close();
            } catch (IOException e) {
            }
        }
    }
}
