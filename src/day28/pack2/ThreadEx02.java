package day28.pack2;

public class ThreadEx02 {
    public static void main(String[] args) {

        Go go = new Go();
        Come come = new Come();

        System.out.println("시작");
        // 쓰레드 실행 방법이 아님
        /*go.run();
        come.run();*/
        
        //이게 쓰레드 실행 방법
        go.start();
        come.start();
        System.out.println("끝");
    }
}
