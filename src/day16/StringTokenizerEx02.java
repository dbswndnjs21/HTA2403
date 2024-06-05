package day16;

import java.util.StringTokenizer;

public class StringTokenizerEx02 {
    public static void main(String[] args) {
        // StringTokenize / split
        String str = "사과&참외&&수박&&&딸기";
        StringTokenizer st = new StringTokenizer(str, "&");

        System.out.println(st.countTokens()); //4

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        String[] arr = str.split("&");
        System.out.println(arr.length); // 7
        for (String s : arr) {
            System.out.println(s);
        }

    }
}
