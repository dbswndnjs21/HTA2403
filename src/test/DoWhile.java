package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhile {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0; // 사용자입력을 저장할 공간
        int count = 0; // 시도횟수를 세기위한 변수

        while (true) {
            count++;
            System.out.println(count);
            System.out.print("1과 100 사이 숫자를 입력하세요 :");
            input = Integer.parseInt(br.readLine());
            if (answer > input) {
                System.out.println("더 큰수를 입력하세요 .");
            } else if (answer < input) {
                System.out.println("더 작은수를 입력하세요.");
            } else {
                System.out.println(" 맞췄습니다 .");
                System.out.println("시도한 횟수는 " + count + " 입니다 .");
                break;
            }
        }
    }
}