package day28.pack7;

import javax.swing.*;

public class Ex13_9 {
    public static void main(String[] args) {
        Thread9_1 th1 = new Thread9_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
        System.out.println("입력하신 값은 " +  input + "입니다");
        th1.interrupt();
        System.out.println("isInterrupted() :   " + th1.isInterrupted());
    }
}
