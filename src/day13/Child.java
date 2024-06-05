package day13;

public class Child  extends Parent{

    void method() {
        System.out.println("this.x = " + this.x);

        super.x = 10;
        this.x = 5;
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);

    }
}
