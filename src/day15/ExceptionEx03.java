package day15;

public class ExceptionEx03 {
    public static void main(String[] args) {

        System.out.println("프로그램 시작");

        // 현재 날짜 출력
        java.util.Date data1 = new java.util.Date();
        java.util.Date data2 = null;

        System.out.println(data1.toLocaleString());
        System.out.println(data2.toLocaleString());
        System.out.println("프로그램 끝");


    }
}
