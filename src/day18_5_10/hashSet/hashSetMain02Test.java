package day18_5_10.hashSet;

import java.util.HashSet;

public class hashSetMain02Test {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 21);
        Person p2 = new Person("박문수", 22);

        HashSet<Person> hs = new HashSet<Person>();
        HashSet<String> hs1 = new HashSet<String>();

        String s = new String("a");
        String s1 = new String("a");
        String a = "윤";
        String a2 = "윤";

        hs1.add(s);
        hs1.add(s1);
        hs1.add(a);
        hs1.add(a2);
        System.out.println(hs1);

        hs.add(p1);
        hs.add(p2);

        System.out.println(hs);

        Person p3 = new Person("박문수", 22);
        hs.add(p3);

        System.out.println(hs);

    }
}
