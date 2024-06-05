package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int n = sc.nextInt();     // 몇 개의 수를 비교할건지 받아오기
        int[] arr = new int[n];

        //
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();   // 배열에 비교할 숫자들 넣기
        }

        int num = sc.nextInt();  // 찾을 숫자 넣기

        for (int j = 0; j < arr.length; j++) { // 찾을 숫자를 배열에 담긴 값이랑 비교 후 맞으면 count++
            if (num == arr[j]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
