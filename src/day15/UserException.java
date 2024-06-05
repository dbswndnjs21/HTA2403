package day15;

public class UserException {
    public void method01(int num) {
        // num에 입력을 검사
        // 100 이상이면 정상 / 이하면 비정상
        if (num >= 100) {
            System.out.println("정상");
        } else {
            System.out.println("비정상");
        }
    }

    public void method2(int num) {
        try {
            if (num >= 100) {
                System.out.println("정상");
            } else {
                throw new Exception("비정상");
            }
        } catch (Exception e) {
            System.out.println("[에러]" + e.getMessage());
        }
    }

    public void method03(int num) throws Exception {
        if (num >= 100) {
            System.out.println("정상");
        } else {
            throw new Exception("비정상");
        }
    }

    public void method04(int num) throws MyException {
        if (num >= 100) {
            System.out.println("정상");
        } else {
            throw new MyException("비정상");
        }
    }

    public void method05(int num) throws Exception {
        if (num >= 100) {
            System.out.println("정상");
        } else {
            throw new Exception("비정상");
        }
    }

}
