package day16;

import java.util.Date; // 여기

public class DateEx01 {
    public static void main(String[] args) {
        
        // java.util
        // 여기부턴 import 필요
        Date d = new Date();
        // java.util.Date d = new java.util.Date(); 도 가능

        System.out.println(d);
        //toString 오버라이딩
        System.out.println(d.toString());

        // deprecated  미래엔 사라질거라 자제시킴
        System.out.println(d.toLocaleString());

        String strDate = d.toLocaleString();
        System.out.println(strDate);

        // 연 월 일 분리 - 문자열 조작
        String year = strDate.substring(0, 4);
        String month = strDate.substring(6, 7);
        String day = strDate.substring(9, 10);

        System.out.println(d.getYear() + 1990);
        System.out.println(d.getMonth() + 1);
        System.out.println(d.getDate());
        // 일요일이 0 임
        System.out.println(d.getDay());

        // 요일 한글 표시
        String[] weekname = {"일", "월", " 화", "수", "목", "금", "토"};
        System.out.println(weekname[d.getDay()]);
        
    }
}


