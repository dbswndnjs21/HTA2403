package day17_5_9.pack1;

public class DropShip extends Unit{
    @Override
    void move(int x, int y) {
        System.out.println("DropShip [x="+x + " y = " + y + " ]");
    }
    
    void load() {
        System.out.println("선택한 대상을 태운다");
    }
    
    void unload() {
        System.out.println("선택한 대상을 내린다");
    }
}
