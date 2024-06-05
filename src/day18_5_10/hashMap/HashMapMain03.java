package day18_5_10.hashMap;


import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapMain03 {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 22);
        Person p2 = new Person("박문수", 23);

        HashMap<String, Person> hm = new HashMap<String,Person>();

        hm.put("a",p1);
        hm.put("b",p2);

        System.out.println(hm);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        Collection<Person> values = hm.values();
        for (Person value : values) {
            System.out.println(value);
        }
    }
}
