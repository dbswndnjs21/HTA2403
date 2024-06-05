package day17_5_9.pack3;

public interface MyInterface {

    default void method1() {
        System.out.println("method1() in Myinterface");
    }

    default void method2() {
        System.out.println("method2() in Myinterface");
    }
    static void staticMethod() {
        System.out.println("staticMethod in Myinterface");
    }
}
