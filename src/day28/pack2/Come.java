package day28.pack2;

public class Come extends Thread{

    @Override
    public void run() {
        // 쓰레드가 처리해야할 작업
        for (int i = 1; i <= 10; i++) {
            System.out.println("come : " + i);
        }
    }
}
