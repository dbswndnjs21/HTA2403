package day18_5_10.hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapMain02 {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("a", "박문수");
        hashMap.put("b", "홍길동");
        hashMap.put("c", "임꺾정");

        // Key 접근
        Set<String> keys = hashMap.keySet(); // hashMap 객체에 key값 을 keys 변수에 넣기
        System.out.println(keys);

        for (String key : keys) {
            System.out.println(key + " : " + hashMap.get(key));
        }

        // Value 접근
        Collection<String> values = hashMap.values(); // [박문수, 홍길동, 임꺾정]를 values에 넣기
        for (String value : values) {
            System.out.println(value);
        }
    }
}
