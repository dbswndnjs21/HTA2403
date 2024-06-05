package test;

import java.util.Scanner;

public class hour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int hour = sc.nextInt();

            if (hour == 99) {
                System.out.println("프로그램 종료");
                return;
            }
            if (hour <= 12) {
                System.out.println("아침 " + hour + " 시 입니다");
                if (hour <= 9) {
                    System.out.println("아침");
                } else {
                    System.out.println("아점");
                }
            } else {
                if (hour <= 15) {
                    System.out.println("점저");
                } else {
                    System.out.println("저녁");
                }
            }
        }
    }
}
