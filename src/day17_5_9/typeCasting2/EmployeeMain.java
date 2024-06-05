package day17_5_9.typeCasting2;

public class EmployeeMain {
    public static void main(String[] args) {
        ChildEmployee c1 = new ChildEmployee();
        Child2Employee c2 = new Child2Employee();

        c1.salary();
        c2.salary();

        // 다형성
        Employee e1 = new ChildEmployee();

        Employee e2 = new Child2Employee();

        e1.salary();
        e2.salary();

    }
}
