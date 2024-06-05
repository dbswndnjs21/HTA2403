package day18_5_10.rambda;

public class RambdaMain {
    public static void main(String[] args) {
        // 내부 익명 클래스
        MyFunctionalInter f = new MyFunctionalInter() {

            public void method() {
                System.out.println("method 호출");
            }
        };

        f.method();
        
        // Lambda 형석으로 표현가능
        f = () -> {
            System.out.println("method() 호출 2");
        };

        f.method();

        // {}를 없앨수도있음
        f = () -> System.out.println("method() 호출 3");

        f.method();

    }
}
