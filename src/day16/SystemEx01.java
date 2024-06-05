package day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemEx01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("프로그램 시작");
        String a = br.readLine();
        // 입력값 검사할때
        if (a.length() <= 0) {
            System.out.println("비정상 입력");
            System.exit( 0 );
        }
        System.out.println("정상 입력");
        System.out.println("프로그램 끝");
    }
}
