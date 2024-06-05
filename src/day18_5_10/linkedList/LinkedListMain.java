package day18_5_10.linkedList;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("홍길동");
        ll.add("박문수");

        System.out.println(ll.size());
        System.out.println(ll);

        for (String s : ll) {
            System.out.println(s);
        }

    }
}
