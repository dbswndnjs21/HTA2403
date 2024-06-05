package day13;

public class Ex7_1 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();

        stv.channel = 10;
        stv.channelUp();
        System.out.println(stv.channel); //11

        System.out.println(stv.caption);
        stv.displayCaption("Hello World");  //false라서 안나옴
        stv.caption = true;
        stv.displayCaption("Hello World");
    }
}
