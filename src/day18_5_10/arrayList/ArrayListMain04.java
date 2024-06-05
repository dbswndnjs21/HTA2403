package day18_5_10.arrayList;

import java.util.ArrayList;

public class ArrayListMain04 {
    public static void main(String[] args) {
        // generic (제네릭)
        ArrayList<String> a1 = new ArrayList<String>();
        
        //자료형이 Object가 아니고 String으로 변경됨
        a1.add("홍길동");
        a1.add("박문수");
        //a1.add(10);  에러

        // 이제는 형변환 없이 데이터 가져오기 가능
        String str = a1.get(0);
        System.out.println(str);

        // 형변환 없이 바로가능
        for (String s : a1) {
            System.out.println(s);
        }

    }
}
