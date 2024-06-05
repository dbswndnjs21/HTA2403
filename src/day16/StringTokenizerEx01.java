package day16;

import java.util.StringTokenizer;

public class StringTokenizerEx01 {
    public static void main(String[] args) {

        String str = "사과 참외 수박 딸기";
        StringTokenizer st1 = new StringTokenizer(str);

        System.out.println(st1.countTokens());

        System.out.println(st1.nextToken());
//        System.out.println(st1.nextToken());
//        System.out.println(st1.nextToken());
//        System.out.println(st1.hasMoreTokens());
//        System.out.println(st1.nextToken());
//        System.out.println(st1.hasMoreTokens());
//        System.out.println(st1.nextToken());

        //Token 출력 방법
//        while (st1.hasMoreTokens()) { // 객체에 더 이상 토큰이 없으면 false 호출
//            System.out.println(st1.nextToken());
//        }

        String str2 = "사과&참외&수박&딸기";
        StringTokenizer st2 = new StringTokenizer(str2, "&"); //&단위로 구분
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }
        
    }
}
