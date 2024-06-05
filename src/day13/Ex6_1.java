package day13;

public class Ex6_1 {
    public static void main(String[] args) {
        Students st = new Students("홍길동", 1, 1, 100, 60, 76);

//        String str = st.info();
//        System.out.println(str);

        System.out.println("이름 : " + st.name);
        System.out.println("총점 : " + st.getTotal());
        System.out.println("평균 : " + st.getAverage());

    }
}
