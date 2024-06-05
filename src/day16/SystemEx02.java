package day16;

public class SystemEx02 {
    public static void main(String[] args) {

        // 시간 측정 

        // 타임 스탬프
        System.out.println(System.nanoTime());
        System.out.println(System.currentTimeMillis());

        long time1 = System.nanoTime();

        int sum = 0;
        for (int i = 1; i <= 1_000_000; i++) {
            sum += i;
        }

        long time2 = System.nanoTime();

        // 작업시간 확인
        System.out.println("실행 시간 : " + (time2 - time1));
    }
}
