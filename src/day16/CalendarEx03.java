package day16;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx03 {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        // 현재 날짜 한줄로 알아내기
        System.out.println(c1.getTime().toLocaleString());

        // 날짜 더하기
        c1.add(Calendar.DATE, 1);
        System.out.println(c1.getTime().toLocaleString());

        c1.add(Calendar.DATE, -2);
        System.out.println(c1.getTime().toLocaleString());

        c1.add(Calendar.DATE, 6);
        System.out.println(c1.getTime().toLocaleString());
        
    }
}
