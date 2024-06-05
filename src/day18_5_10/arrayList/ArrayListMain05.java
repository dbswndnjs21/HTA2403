package day18_5_10.arrayList;

import java.util.ArrayList;

public class ArrayListMain05 {
    public static void main(String[] args) {
        // Student(클래스) 형 제네릭 가능
        ArrayList<Student> a1 = new ArrayList<Student>();

        Student s1 = new Student("1001", "홍길동");
        Student s2 = new Student("1002", "박문수");

        a1.add(s1);
        a1.add(s2);
        
        //오버라이딩 안하면 참조 값 나옴
        System.out.println(s1.toString());

        Student stu = a1.get(0);
        System.out.println(stu);
    }
}
