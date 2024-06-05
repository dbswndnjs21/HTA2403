package day17_5_9.pack1;

public class StarMain {
    public static void main(String[] args) {
        Unit[] group = {new Marine(), new Tank(), new DropShip()};

        for (int i = 0; i < group.length; i++) {
            group[i].move(100, 200);
        }

        Unit unit1 = new Marine();
        Unit unit2 = new Tank();
        Unit unit3 = new DropShip();

        unit1.move(10,20);
    }
}
