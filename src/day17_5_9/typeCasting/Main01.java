package day17_5_9.typeCasting;

public class Main01 {
    public static void main(String[] args) {
        Parent p1 = new Child1();
        Parent p2 = new Child2();

        Child1 c1 = (Child1) p1;
    }
}
