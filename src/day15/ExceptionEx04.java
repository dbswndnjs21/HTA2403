package day15;

public class ExceptionEx04 {
    public static void main(String[] args) {
        System.out.println("시작");

        String name  = "Hello";
        int num1 = 0;
        int num2 = 10;

        System.out.println(name.length());
        int result  = num2 / num1;
        System.out.println("result = " + result);
                
        System.out.println("끝");
    }
}
