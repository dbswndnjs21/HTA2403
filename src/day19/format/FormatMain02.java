package day19.format;

import java.text.DecimalFormat;
import java.text.ParseException;

public class FormatMain02 {
    public static void main(String[] args) {

        String strNum = "$1,234.5";

//        double d = Double.parseDouble(strNum);
//        System.out.println(d);

        DecimalFormat format = new DecimalFormat("$#,###.#");

        try {
            double d = (double) format.parse(strNum); // 이문장이
            //unreported exception java.text.ParseException; 여서 try catch문으로 덮음
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
