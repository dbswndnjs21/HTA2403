package day16;

import java.util.StringJoiner;

public class StringJoinerEx01 {
    public static void main(String[] args) {
        // 문자열 연결
        // + / concat / format

        String str1 = String.format("%s,%s,%s,%s", "수박", "딸기", "참외", "사과");
        System.out.println(str1);

        // 배열 -> 문자열
        String[] strs = {"수박", "딸기", "참외", "사과"};

        // String join
        String str = String.join(",", strs); // 배열 데이터를 , 단위로 묶는다
        System.out.println(str);

        // 구분자 중심의 문자열 추가
        StringJoiner sj = new StringJoiner(",");
        sj.add("수박");
        sj.add("딸기");
        sj.add("참외");
        sj.add("사과");

        System.out.println(sj.toString());
        
    }
}
