package ex6;

public class MethodMainEx02 {
    public static void main(String[] args) {
        Method m = new Method();
        m.doFunc("호출");
        m.doFunc(12);
    }
}

class Method {
    void doFunc(int a) {
        System.out.println("int 형 dofunc");
    }

    void doFunc(String s) {
        System.out.println("String 형 dofunc");
    }

}
