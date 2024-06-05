package day17_5_9.pack2;

public class Main {
    public static void main(String[] args) {

        Fighter f = new Fighter();
        f.move(0, 0);
        f.attack();

        Fightable ft = new Fighter();
        ft.move(0,0);
        ft.attack();

        Movable m =  new Fighter();
        m.move(0, 0);

        Attackable a = new Fighter();
        a.attack();
    }
}
