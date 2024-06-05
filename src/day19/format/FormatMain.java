package day19.format;

import java.text.DecimalFormat;

public class FormatMain {
    public static void main(String[] args) {

        // 형식화된 출력
        System.out.printf("%s-%s%n", "10", "100");

        // 형식화된 입력
        String fNum = String.format("%s-%s", "10", "100");
        System.out.println(fNum);

        // 숫자
        // 날짜
        DecimalFormat fo = new DecimalFormat("#,###.#");
        DecimalFormat fo1 = new DecimalFormat("000,000.000");


//        double dbNum = 1234.5;
        double dbNum1 = 1234.56; //반올림도 해줌
        double dbNum2 = 234.56;  // 자리수 맞춰줌  234.6

        String strNum = fo.format(dbNum2);
        String strNum2 = fo1.format(dbNum1);
        System.out.println(strNum);
        System.out.println(strNum2);

    }
}
