package day28.pack5;

public class Ex13_6 {
    public static void main(String[] args) {
        Thread6_1 t1 = new Thread6_1();
        Thread6_2 t2 = new Thread6_2();

        t2.setPriority(7);

        System.out.println("Priority of t1(-) = " + t1.getPriority());
        System.out.println("Priority of t2(|) = " + t2.getPriority());
        t1.start();
        t2.start();
    }
}
