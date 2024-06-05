package day19.format;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_9 {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/ MM/ dd");

        try {
            Date d = df.parse("2024년 5월 13일"); // 이 문장도 try catch로 덮어줘야함
            System.out.println(df2.format(d));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
