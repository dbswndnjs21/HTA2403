package day18_5_10.arrayList;

import java.util.ArrayList;

public class ArrayListMain {

    public static void main(String[] args) {

        // ArrayList 생성
        ArrayList a1 = new ArrayList(); // 크기 0
        ArrayList a2 = new ArrayList(100); // 크기 100

        String data1 = "홍길동"; // 문자열은 그대로 들어가지않는다
        // Object로 형변환되어서 들어감

        // String -> Object로 자동형변환 되어 들어감
        a1.add(data1); // 받을수있는 자료형은 Object임

        // 위에 넣은 데이터가 실제로 들어가는 방식
        Object obj1 = data1;
        a1.add(obj1);

        a1.add("박문수"); // 동일

        // 입력된 데이터의 길이를 알려줌
        System.out.println(a1.size());
        
        // 데이터를 배열 형식으로 보여줌
        System.out.println(a1.toString());

        a1.add("임꺽정");

        System.out.println(a1.toString());

        // 데이터 가져오기 get -> return Object형
        // String str = a1.get(0); // 자료형이 다르기 때문에 받을수없음
        // String 형으로 처음에 넣었지만  Object 형으로 자동형변환이 이뤄지고
        // get 할때는 Object형으로 return되기 때문에 오류
        Object obj = a1.get(0);
        String str = (String) obj;
        System.out.println(str);

        // 전체 데이터 가져오기
        for (int i = 0; i < a1.size(); i++) {
            String tstr = (String) a1.get(i);
            System.out.println(tstr);
        }

        // 향산된 for문으로 전체 데이터 가져오기
        for (Object tobj : a1) {
            String tstr = (String)tobj;
            System.out.println(tstr);
        }

        // 삽입
        a1.add(2, "장길산");
        System.out.println(a1);

        // 수정
        a1.set(0, "이몽룡");
        System.out.println(a1);

        // 삭제
        a1.remove(0);
        System.out.println(a1);

        // 0을 위에서 지우면 하나씩 밀리나봄
        a1.remove(0);
        System.out.println(a1);

        a1.clear(); // 전체 지우기
        System.out.println(a1);
    }

}
