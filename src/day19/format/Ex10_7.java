package day19.format;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex10_7 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#.###E0");

        try {
            Number num = df.parse("1,234,1567.89");
            System.out.println();
            double d = num.doubleValue();
            System.out.println(d + " - > ");
            System.out.println(df2.format(num));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
