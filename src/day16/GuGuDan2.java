package day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuGuDan2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("시작 단 수를 입력하세요");
        int startDan = Integer.parseInt(br.readLine());

        System.out.println("끝 단을 입력하세요");
        int EndDan = Integer.parseInt(br.readLine());

        for (int i = startDan; i <= EndDan; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " X " + j + " = " + i * j + "   ");
            }
            System.out.println();
        }

    }
}
