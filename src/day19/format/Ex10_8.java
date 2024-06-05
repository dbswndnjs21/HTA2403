package day19.format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_8 {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
        SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;

        sdf1 = new SimpleDateFormat("yyyy- MM - dd");
        sdf2 = new SimpleDateFormat("''yy년 MMM dd일 E요일");

        System.out.println(sdf2.format(today));

    }
}
