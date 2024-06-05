package day17_5_9;

public class typeCastingMain2 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child2 c2 = new Child2();

        // 강제 형변환
//      Child2 c31 =  p;
        //  런타임 오류
//        Child2 c32 = (Child2) p;

        Parent p1 = c2;
        Child2 c3 = (Child2) p1;

    }
}
