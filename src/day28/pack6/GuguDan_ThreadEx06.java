package day28.pack6;

public class GuguDan_ThreadEx06 {
    public static void main(String[] args) {
        Gugudan g1 = new Gugudan(2);
        Gugudan g2 = new Gugudan(8);

        g1.setDaemon(true);
        g2.setDaemon(true);

        g1.setName("2단");
        g2.setName("8단");

        System.out.println("시작");
        g1.start();
        g2.start();
/*

        try {
            // 잠시 멈춤
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
*/

        System.out.println("끝");
    }
}
