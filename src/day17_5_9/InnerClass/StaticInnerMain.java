package day17_5_9.InnerClass;

public class StaticInnerMain {
    public static void main(String[] args) {
        //satic일때의 선언
        // 외부클래스를 선언 하지않고 내부 클래스 선언 가능
        Outer.Inner inner = new Outer.Inner();

        System.out.println(inner.y2);

        inner.viewInner();
    }
}

