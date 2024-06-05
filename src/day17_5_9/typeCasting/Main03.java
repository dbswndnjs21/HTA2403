package day17_5_9.typeCasting;

public class Main03 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.viewParent();
        p.doFunc();

        Parent poly = new Child1();
        poly.viewParent();
//      poly.viewChild1();  부모형 이라 자식 메서드 호출 안됨
        Parent poly2 =new Child2();
        System.out.println("여기1");
        poly.doFunc(); // 부모형 이지만 오버라이딩된 자식의 메서드 호출됨
        poly2.doFunc();

        Child1 c1 = new Child1();
        System.out.println("여기");
        c1.viewChild1();
        c1.doFunc(); // 부모의 메서드가 아닌 오버라이딩 된 자식의 메서드가 호출됨
        
    }
}
