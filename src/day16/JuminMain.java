package day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JuminMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String juMin = br.readLine();

        if (juMin.length() != 14) {
            System.out.println("주민등록번호 길이가 맞지않습니다");
        } else {
            Jumin jumin = new Jumin();
            boolean chk =  jumin.isJuminCheck(juMin);
            if (chk) {
                System.out.println("유효한 주민번호입니다");
            } else {
                System.out.println("유효하지않은 주민번호 입니다");
            } 
        }
    }
}
