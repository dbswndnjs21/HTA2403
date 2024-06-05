package day16;

import java.util.Calendar;

public class CalendarEx01 {
    public static void main(String[] args) {
        // Calendar는 추상 클래스 이기 때문에 객체 생성을 할수 없다
        // getInstance() 메서드를 통해서 인스턴스를 얻어야한다
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        System.out.println(cal.toString());

        // 현재 년도 가져오기
        System.out.println(cal.get(Calendar.YEAR));

        // 현 재 월
        System.out.println(cal.get(Calendar.MONTH) + 1);
        
        // 현재 일
        System.out.println(cal.get(Calendar.DATE));

        // 요일 일요일이 1
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));

        System.out.println(cal.getTimeInMillis());

        // 이번달의 최고 일 31일 -> 31
        System.out.println(cal.getActualMaximum(Calendar.DATE));
        // 최소 일 1
        System.out.println(cal.getActualMinimum(Calendar.DATE));





        
    }
}
