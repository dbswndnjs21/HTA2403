package day28.pack3;

public class ThreadEx03 {
    public static void main(String[] args) {
        Go go = new Go();
        Come come = new Come();

        Thread t1 = new Thread(go);
        Thread t2 = new Thread(come);
        System.out.println("시작");
        t1.start();
        t2.start();
        System.out.println("끝");

    }
}
