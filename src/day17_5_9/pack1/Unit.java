package day17_5_9.pack1;

abstract public class Unit {
    int x,y;

    abstract void move(int x, int y);
    void stop() {
        System.out.println("현재 위치 정지");
    }
}
