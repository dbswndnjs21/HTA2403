package day18_5_10.ramdba2;

public class RambdaMain {
    public static void main(String[] args) {
        // method01 인지 02인지 모름 그래서 에러가 남
        MyFunctionalInter f = () -> System.out.println("method() 호출");
         f.method01();
        
    }
}
