package day14;

class Parent {
    void viewParent() {
        System.out.println("부모 클래스");
    }
}

class Child extends  Parent {
    @Override
    void viewParent() {
        System.out.println("자식 클래스");
    }
}
public class InheritanceEx {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.viewParent();

        Child c  = new Child();
        c.viewParent();

        Parent pc = new Child();
        pc.viewParent();
    }
}
