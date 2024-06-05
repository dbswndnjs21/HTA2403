package day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionEx1111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num11= Integer.parseInt(br.readLine());

        System.out.println("프로그램 시작");

        int num2 = 100;
        try {
            int result = num2 / num11;
            System.out.println("result = " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("무조건 실행되는 구역");
        }

        System.out.println("프로그램 끝");


    }
}
