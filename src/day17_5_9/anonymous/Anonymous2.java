package day17_5_9.anonymous;

public class Anonymous2 {
    public static void main(String[] args) {
        new InnerB() {
            @Override
            public void viewInnerB() {
                System.out.println("viewInnerB 호출");
            }
        }.viewInnerB();
    }
}
