package day16;

import java.util.Scanner;

public class ScannerEx02 {
    public static void main(String[] args) {
        // System.in  = 표준 입력(키보드 입력)
        Scanner sc = new Scanner(System.in);

        System.out.print("아이디 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호 : ");
        String password = sc.nextLine();

        System.out.println("입력 : " + id);
        System.out.println("입력 : " + password);

    }
}
