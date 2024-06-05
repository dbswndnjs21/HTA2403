package extends1;

public class ClassB extends ClassA {

    public ClassB(int a) {
        this(a, 0); //다른 생성자를 찾는다 // 부모의 생성자를 호출안한 이유는 다른 생성자에 있기때문
                                          // 한번만 해주면됨
        System.out.println("ClassB 생성자 a =" + a);
    }

    public ClassB(int a, int b) {
        super(); // 부모가 기본생성자라서 생략가능
        System.out.println("ClassB 생성자 a = " + a + "b = " + b );
    }
}
