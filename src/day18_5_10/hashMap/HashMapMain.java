package day18_5_10.hashMap;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        // Key와 Value의 자료형
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("a", "박문수");
        hashMap.put("b", "홍길동");

        System.out.println(hashMap); // {a=박문수, b=홍길동}
        System.out.println(hashMap.size());

        hashMap.put("c", "임꺾정");
        System.out.println(hashMap);

        // Key가 같으면 수정이 됨
        hashMap.put("b", "이몽룡");
        System.out.println(hashMap);

        // 데이터 확인
        System.out.println(hashMap.get("a"));
        
        // 삭제
        hashMap.remove("a");
        System.out.println(hashMap);

        // 전부 삭제
        hashMap.clear();
        System.out.println(hashMap);
    }
}
