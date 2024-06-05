package day16;

import java.util.Random;

public class RandomEx02 {
    public static void main(String[] args) {
        // Math.ramdom()
        // Random
        Random r1 = new Random();
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(r1.nextInt(45) + 1 + " ");
            }
            System.out.println();
        }
    }
}
