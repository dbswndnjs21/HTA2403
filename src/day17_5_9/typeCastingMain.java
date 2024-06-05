package day17_5_9;


public class typeCastingMain {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child1 c = new Child1();

//        Parent p1 = c1;

        Child2 c2 = new Child2();
        Parent p2 = c2; // 부모는 자식을 담음

        Parent p3 = new Child2();

        // 모든 클래스는 Object 형변환 가능
        Object o1 = new Parent();
        Object o2 = new Child1();
        Object o3 = new Child2();


    }
}
