package day28.pack6;

public class Gugudan extends Thread{

    private int dan;

    public Gugudan(int dan) {
        this.dan = dan;
    }

    @Override
    public void run() {

        System.out.println(this.getName() + " 시작");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%s X %s = %s ", dan, i, (dan * i));
            System.out.println();
        }
    }
}
