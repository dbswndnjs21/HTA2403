package day19.format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatSimpleDateMain {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");

        Date date = new Date();

        String strDate1 = format.format(date);
        String strDate2 = format.format(new Date()); // 이것도 가능

        System.out.println(strDate1);
        System.out.println(strDate2);

    }
}
