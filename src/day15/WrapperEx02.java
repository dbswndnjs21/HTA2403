package day15;

import java.awt.event.ItemEvent;
import java.net.Inet4Address;

public class WrapperEx02 {
    public static void main(String[] args) {

        // deprecated - 미래에 없애질 것을 예약
   //   Integer i1 = new Integer(123);
        Integer i1 = Integer.valueOf(123);
        Integer i2 = Integer.valueOf("123");
        Integer i3 = 346;

        byte b= i1.byteValue();
        float f = i1.floatValue();

        System.out.println(b);
        System.out.println(f);

        String str = i1.toString();
        System.out.println(str);

        //문자열 -> 정수 / 실수
        int i11 = Integer.parseInt("123");
        float f1 = Float.parseFloat("123");
        System.out.println(i11);
        System.out.println(f1);

        String str1 = Integer.toString(i11);
        System.out.println(str1  instanceof String);
    }
}
