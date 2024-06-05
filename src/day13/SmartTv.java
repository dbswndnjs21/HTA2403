package day13;

public class SmartTv extends Tv{
    boolean caption;

    void displayCaption (String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}
