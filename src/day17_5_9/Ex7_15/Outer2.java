package day17_5_9.Ex7_15;

public class Outer2 {
    class InstanceInner {
        int iv = 100;
    }

    static class staticInner {
        int iv = 200;
        static int cv = 300;
    }
    void myMethod() {
        class LocalInner {
            int iv = 400;
        }
    }
}
