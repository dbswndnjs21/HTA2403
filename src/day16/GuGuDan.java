package day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuGuDan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("단 수를 입력하세요");
        int dan = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " X " + i + " = " + dan * i);
        }
    }

}
