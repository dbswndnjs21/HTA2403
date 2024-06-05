package day28.pack1;

public class ThreadEx {
    public static void main(String[] args) {
        Go go = new Go();
        Come come = new Come();

        // 순차 처리 
        System.out.println("시작");
        go.run();
        come.run();
        System.out.println("끝");
    }
}
