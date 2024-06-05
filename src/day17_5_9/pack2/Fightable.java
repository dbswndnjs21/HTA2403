package day17_5_9.pack2;

public interface Fightable extends Movable, Attackable{

    @Override
    void attack();

    @Override
    void move(int x, int y);
}
