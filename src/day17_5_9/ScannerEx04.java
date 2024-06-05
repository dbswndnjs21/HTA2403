package day17_5_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerEx04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("값을 입력하세요. 입력을 마치려면 q를 입력하세요");

        String msg = "";
        while (true) {
            System.out.println("입력 > ");
            msg = br.readLine();
            if (!msg.equalsIgnoreCase("q")) { // 대소문자를 가리지않고
                System.out.println("입력 메세지 : " + msg);
            } else {
                System.out.println("프로그램 종료");
                break; // 루프 탈출
            }
        }
    }
}
