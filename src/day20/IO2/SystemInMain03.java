package day20.IO2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInMain03 {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("입력 > ");
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());
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
