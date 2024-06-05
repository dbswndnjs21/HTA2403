package day16;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx02 {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        c1.set(2025, 5-1, 1);
        System.out.println(c1.toString());

        // 현재 날짜, 시간 뽑기
        Date d = c1.getTime();
        // toLocaleString이 d에 들어간 날짜 데이터의 포멧을 바꿔줌
        System.out.println(d.toLocaleString());

    }
}
