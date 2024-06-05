package day28.pack4;

public class ThreadEx04 {
    public static void main(String[] args) {
        
        //익명 내부 클래스를 이용
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10 ; i++) {
                    System.out.println("Go : " + i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("come : " + i);
                }
            }
        });
        
        //람다식
        Thread t3 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("come : " + i);
            }
        } );


        System.out.println("시작");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("끝");
    }

}
