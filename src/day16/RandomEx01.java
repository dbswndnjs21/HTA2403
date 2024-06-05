package day16;

import java.util.Random;

public class RandomEx01 {
    public static void main(String[] args) {
        // Math.ramdom()
        // Random

        Random r1 = new Random();

        System.out.println(r1.nextDouble());
        System.out.println(r1.nextDouble());

        System.out.println(r1.nextInt());
        System.out.println(r1.nextInt());

        // 0 <= x < 10
        System.out.println(r1.nextInt(10));
        System.out.println(r1.nextInt(10));

        // 1 <= x < 46
        System.out.println(r1.nextInt(45) + 1);

    }
}
