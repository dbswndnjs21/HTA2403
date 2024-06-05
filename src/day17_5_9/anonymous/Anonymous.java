package day17_5_9.anonymous;

public class Anonymous {
    public static void main(String[] args) {
        // InnerA a = new InnerA(); 사용 안됨
        
        // 익명 이너 클래스
        InnerA a = new InnerA() {
            @Override
            public void viewInner() {
                System.out.println("viewInner() 호출");
            }
        };
        a.viewInner();
        
        new InnerA() {
            public void viewInner() {
                System.out.println("viewInner() 호출");
            }
        };
    }
}
