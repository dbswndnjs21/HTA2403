package day17_5_9.pack1;

public class Tank extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("Tank [x="+x + " y = " + y + " ]");
    }
    void changeMode() {
        System.out.println("공격모드 변환");
    }
    
}
