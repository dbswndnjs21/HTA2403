package day17_5_9.pack1;

public class Marine extends Unit {

    @Override
    void move(int x, int y) {
        System.out.println("Marine [x="+x + " y = " + y + " ]");
    }
    
    void stimPack() {
        System.out.println("스팀팩 사용");
    }
}
