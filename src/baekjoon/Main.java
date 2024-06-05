package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
//        int n = sc.nextInt();  // 몇개의 숫자를 비교 할지
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];  // 받아온 수만큼 배열 생성

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int num = sc.nextInt();

        for (int j = 0; j < arr.length; j++) {
            if (num == arr[j]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
