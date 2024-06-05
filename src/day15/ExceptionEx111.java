package day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionEx111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num11= Integer.parseInt(br.readLine());

        System.out.println("프로그램 시작");

//        int num1 = 0;
        int num2 = 100;
        try {
            System.out.println("1");
            int result = num2 / num11;
            System.out.println("2");
            System.out.println("result = " + result);
        } catch (ArithmeticException e) {
            // printStackTrace()
            // getMessage()
            System.out.println("3");
            //System.out.println("0 으로 나울수없음");
            System.out.println(e.getMessage()); // 예외 내용 나옴
            e.printStackTrace();
        }

        System.out.println("프로그램 끝");


    }
}
