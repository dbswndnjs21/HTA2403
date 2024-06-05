package day17_5_9.pack1;

public class ClassA implements InterA, InterB{

    @Override
    public void methodA() {
        System.out.println("ClassA.methodA 호출");
    }

    @Override
    public void methodB() {
        System.out.println("ClassA.methodB");
    }

    @Override
    public void methodC() {

    }
}
