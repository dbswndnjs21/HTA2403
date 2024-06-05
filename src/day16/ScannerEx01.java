package day16;

import java.util.Scanner;

public class ScannerEx01 {
    public static void main(String[] args) {
        // System.in  = 표준 입력(키보드 입력)
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        String str = sc.nextLine();
        System.out.println(" 입력 : " + str);

    }
}
