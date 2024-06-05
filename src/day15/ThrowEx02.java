package day15;

public class ThrowEx02 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        // args를 1개를 입력 확인
        try {
            if (args.length == 1) {
                System.out.println(args[0]);
            } else {
//            System.out.println("입력모름");
                throw new Exception("입력오류");
            }
        } catch (Exception e ) {
            System.out.println("에러 : " + e.getMessage());
        }

        System.out.println("프로그램 정상 종료");
    }
}
