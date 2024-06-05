package day16;

import java.util.Date;

public class DateEx02 {
    public static void main(String[] args) {
        //현재 시스템 날짜 시간
        Date d1 = new Date();
        Date d2 = new Date(2024 - 1900,  5-1,1);
        System.out.println(d2.toLocaleString());

        Date d3 = new Date(2024 - 1900,  5-1,1-1);
        System.out.println(d3.toLocaleString());

        Date d4 = new Date(2024 - 1900, 12 - 1, 24);

        System.out.println(d1.getTime());
        Date d5 = new Date(d1.getTime());
        System.out.println(d5.toString());

        Date d6 = new Date(System.currentTimeMillis());
        System.out.println(d6.toLocaleString());

    }
}


