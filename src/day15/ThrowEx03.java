package day15;

public class ThrowEx03 {
    public static void main(String[] args) {
        UserException ue = new UserException();

        // ue.method01(99);
        // ue.method01(101);

        //ue.method2(99);
        //ue.method2(101);


        //ue.method03(99); // must be caught or declared to be thrown -> 호출할때 반듯이 예외처리를 해줘야함

        try {
            ue.method03(99);
        } catch (Exception e) {
            System.out.println("에러 : " + e.getMessage());
        }


        // 사용자 정의 Exception
        /*
        try {
            ue.method04(99);
        } catch (MyException e) {
            System.out.println("에러 : " + e.getMessage());
        }
         */

        try {
            ue.method05(99);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}
