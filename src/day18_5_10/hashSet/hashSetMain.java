package day18_5_10.hashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashSetMain {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        Set<String> set = new HashSet<String>();

        hs.add("홍길동");
        hs.add("박문수");
        hs.add("임꺽정");
        System.out.println(hs);
        System.out.println(hs.size());

        // 중복은 알아서 걸러짐
        hs.add("홍길동");
        hs.add("홍길동");
        System.out.println(hs);
        System.out.println(hs.size());

        hs.add("장길산");
        System.out.println(hs);
        System.out.println(hs.size());

        // 인덱스가 없어서 이렇게 가져오는것
        for (String s : hs) {
            //System.out.println(s);
        }
        
        //이것도 동일
        Iterator<String> i = hs.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
