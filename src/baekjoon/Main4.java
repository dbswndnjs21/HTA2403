package baekjoon;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        // 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = 0;
        double sum = 0.0;
        double a = 0.0;

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max ) {
               max = arr[j];
            }
        }
        for (int k = 0; k < arr.length; k++) {
            a = arr[k]/(double)max * 100;
            sum +=a;
        }
        System.out.println(sum/n);
    }
}
