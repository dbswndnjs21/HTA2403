package day17_5_9.LocalInner;

public class LocalInnerMain {
    public static void main(String[] args) {
        // Inner에선 변경 불가능
        int x= 100;

        class Inner {
            private int y1 = 200;
            public int y2 = 200;

            public Inner() {
                System.out.println("Inner : " + this);
            }
            public void viewInner() {
                System.out.println(x);
                System.out.println(y1);
                System.out.println(y2);
//                x++;
            }
        }
        Inner inner = new Inner();
        inner.viewInner();
    }
}
