package test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();

        if (num % 3 == 0) {
            System.out.println("3의배수입니다");
        } else {
            System.out.println("3의 배수가 아닙니다");
        } 
    }
}


