package baekjoon;

import java.util.Scanner;
// 백준 9093
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {  // 받아올 문장의 수만큼 반복
            String str = sc.nextLine(); // str =  I am happy today
            String[] arr = str.split(" "); // arr [0] = i
                                                // arr [1] = am
                                                // arr [2] = happy
                                                // arr [3] = today
//            System.out.println("arr = " + arr[0]);
//            System.out.println("arr = " + arr[1]);
//            System.out.println("arr = " + arr[2]);
//            System.out.println("arr = " + arr[3]);

            for (String s : arr) {
                //s에 받은 문장을 한단어씩 저장
                StringBuilder sb = new StringBuilder(s);
                //sb.reverse();
                System.out.print(sb.reverse().append(" "));
            }
        }
    }
}
