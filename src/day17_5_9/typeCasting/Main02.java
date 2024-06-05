package day17_5_9.typeCasting;

import java.nio.file.WatchKey;

public class Main02 {
    public static void main(String[] args) {
    Child1 c1 = new Child1();
    Child2 c2 = new Child2();

        Parent p1 = new Child1();
        Parent p2 = new Child2();

        System.out.println(p1 instanceof Child1); // t
        System.out.println(p2 instanceof Child2); // t

        System.out.println(p1 instanceof Child2); // f

        System.out.println(p1 instanceof Parent); // t
        System.out.println(p2 instanceof Parent); // t




    }
}
