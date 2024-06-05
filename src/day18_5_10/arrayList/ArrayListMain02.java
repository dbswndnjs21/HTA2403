package day18_5_10.arrayList;

import java.util.ArrayList;

public class ArrayListMain02 {
    public static void main(String[] args) {
        // 기본 자료형 - 8가지
        // ArrayList 안에 넣기 가능
        // Autoboxing

        ArrayList a1 = new ArrayList();

        // Object - wrapper - autoboxing - 1
        a1.add(1);
        a1.add(2);
        
        // int형을 넣는 원래 형식 (원칙)
        Integer i1 = Integer.valueOf(3); //  -> Integer i1 = 3;  이게 autoboxing
        Object obj = i1;
        a1.add(obj);

        System.out.println(a1.toString());

        Integer i2 = (Integer) a1.get(0);
        System.out.println(i2.intValue());

        //unboxing
        int i3 = (int) a1.get(1); //객체를 형변환 함 그게 언방싱
        System.out.println(i3);
        
    }
}
