package day15;

import java.util.Locale;

public class StringEx03 {
    public static void main(String[] args) {
        String str1 = "hong gil dong";

        String[] arr1 = str1.split(" ");
        for (String s : arr1) {
            String name1 = s.substring(0, 1);
            String daeName1 = name1.toUpperCase();
            String name2 = s.substring(1);
            String sumName = daeName1.concat(name2);

            System.out.println(sumName);
        }
    }
}


