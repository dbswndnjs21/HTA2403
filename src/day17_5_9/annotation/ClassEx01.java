package day17_5_9.annotation;

public class ClassEx01 {
    int newField;
    public void newMethod(){
        System.out.println("ClassEx01.newMethd");
    }
    @Deprecated
    public void oldMethod() {
        System.out.println("ClassEx01.oldMethod");
    }


}
