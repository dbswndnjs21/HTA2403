package day17_5_9.pack2;

public class Fighter implements Fightable{
    @Override
    public void attack() {
        System.out.println("Fighter.attack");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Fighter.move");
    }
}
