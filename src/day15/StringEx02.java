package day15;

public class StringEx02 {
    public static void main(String[] args) {
        String str1 = "Hello String Hello String";
        System.out.println(str1.length());
        System.out.println("Hello".length());

        // 문자 추출 ( 형변환 )
        char ch1 = str1.charAt(0);
        System.out.println(ch1);

        char ch2 = str1.charAt(str1.length() - 1);
        System.out.println(ch2);

        //문자열 추출
        String pstr1 = str1.substring(2);
        System.out.println(pstr1);
        String pstr2 = str1.substring(2,4);
        System.out.println(pstr2);
        
        //위치 검색
        int pos1 = str1.indexOf('l');  // 0부터 니까 2임
        int pos2 = str1.indexOf("ll");
        int pos3 = str1.indexOf("Z");
        System.out.println(pos1);
        System.out.println(pos2);
        System.out.println(pos3); // -1 포함되어있지 않다는 뜻

        // 문자열의 존재 여부
        // startWith / endWith / contains
        System.out.println(str1.startsWith("He")); // t
        System.out.println(str1.startsWith("he")); // f

        //문자열 치환
        System.out.println(str1.replaceAll("Hello", "안녕")); //안녕 String 안녕 String

        // 문자열 결합 : + 
        System.out.println(str1.concat("안녕")); //Hello String Hello String안녕

        // 대소문자 변경
        System.out.println("hello".toUpperCase());
        System.out.println("HELLO".toLowerCase());

        // 문자열 앞뒤 공백 문자 제거
        String oStr1 = "     Hello String      ";
        System.out.println(oStr1.length());
        String oStr2 = oStr1.trim();
        System.out.println(oStr2.length());
        System.out.println(oStr2  + "끝");

        // 구분자 중심의 문자열 분리
        String sStr1 = "apple,banana,pineapple,kiwi";
        String[] strArr1 = sStr1.split(",");
        for (String str : strArr1) {
            System.out.println(str);
        }

        // 문자열 형식의 출력 printf
        // 문자열 형식
        String jStr1 = String.format("%s,%s,%s", "딸기", "사과", "수박");
        System.out.println(jStr1);

    }
}
