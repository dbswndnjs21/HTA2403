package day16;

import java.util.Calendar;

public class CalendarEx04 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);

        // 현재 달의 시작일과 마지막일을 설정
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        int firstDayOfMonth = calendar.get(Calendar.DAY_OF_WEEK); // 첫째날의 요일 (일요일: 1, 월요일: 2, ..., 토요일: 7)
        int lastDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // 현재 달의 마지막 날짜

        // 달력 출력
        System.out.println(year + "년 " + (month + 1) + "월");
        System.out.println("일  월  화  수  목  금  토");

        // 첫째 날의 위치까지 공백 출력
        for (int i = 1; i < firstDayOfMonth; i++) {
            System.out.print("    ");
        }

        // 달력 출력
        for (int i = 1; i <= lastDayOfMonth; i++) {
            System.out.printf("%2d  ", i); // 각 날짜를 오른쪽 정렬하여 출력
            if ((i + firstDayOfMonth - 1) % 7 == 0) { // 한 주가 끝나면 줄 바꿈
                System.out.println();
            }
        }
    }
}
