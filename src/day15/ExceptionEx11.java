package day15;

public class ExceptionEx11 {
    public static void main(String[] args) {

        System.out.println("프로그램 시작");

        int num1 = 0;
        int num2 = 100;

        //Exception 처리 이전의 전통 처리 기법 : if

        if (num1 != 0) {
            int result = num2 / num1;
            System.out.println("result = " + result);
        } else {
            System.out.println("result : 0으로 나눌수없습니다");
        }

        System.out.println("프로그램 끝");


    }
}
