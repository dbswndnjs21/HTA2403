package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (3 <= a && a <= 5) {
            System.out.println("봄");
        } else if (6 <= a && a <= 8) {
            System.out.println("여름");
        } else if (9 <= a && a <= 11) {
            System.out.println("가을");
        } else {
            System.out.println("겨울");
        }
    }
}