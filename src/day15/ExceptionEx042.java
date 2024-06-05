package day15;

public class ExceptionEx042 {
    public static void main(String[] args) {
        System.out.println("시작");

//        String name  = null;
        String name = "hello";
        int num1 = 0;
        int num2 = 10;

        // else if 문 과 비슷함
        try {
            System.out.println(name.length());
            int result = num2 / num1;
            System.out.println("result = " + result);
        } catch (NullPointerException e) {
            System.out.println("[에러 1 ] " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[에러 2 ] " + e.getMessage());
        }

        System.out.println("끝");
    }
}
