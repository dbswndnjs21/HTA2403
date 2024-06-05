package day18_5_10.arrayList;

import java.util.ArrayList;

public class ArrayListMain03 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();

        // 모든 자료형은 Object로 변경 가능
        a1.add("홍길동");
        a1.add("박문수");
        a1.add(10);
        a1.add(20);

        System.out.println(a1);

        System.out.println(a1.get(0));
        System.out.println(a1.get(1));
        System.out.println(a1.get(2));
        System.out.println(a1.get(3));

        // for문을 통해서가져오고싶음
        // 데이터 안정성 X 이거 오류남
        for (int i = 0; i < a1.size(); i++) {
            String str = (String) a1.get(i);
            System.out.println(str);
        }
    }
}
