package day18_5_10.arrayList;

public class Student {
    private String hakbun;
    private String name;

    public Student(String hakbun, String name) {
        this.hakbun = hakbun;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [hakbun =" + hakbun + " name = " + name + " ]";
    }
}
