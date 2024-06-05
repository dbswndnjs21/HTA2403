package day16;

public class SystemEx03 {

    public static void checkSpeed1() {
        long start = System.currentTimeMillis();

        String x = "";
        for (int i = 0; i < 10_000; i++) {
            x += "aaaaa,aaaaa,aaaaa,aaaaa";
        }

        long end = System.currentTimeMillis();
        System.out.println("실행 시간 : " + (end - start));

    }

    public static void checkSpeed2() {
        long start = System.currentTimeMillis();

        StringBuilder x = new StringBuilder();
        for (int i = 0; i < 10_000; i++) {
            x.append("aaaaa,aaaaa,aaaaa,aaaaa");
        }

        long end = System.currentTimeMillis();
        System.out.println("실행 시간 : " + (end - start));

    }
    public static void main(String[] args) {

        //String / StringBuilder
        checkSpeed1();
        checkSpeed2();
    }
}
