package day20.IO2;

import java.io.Serializable;

public class Person implements Serializable {
private String name;
private String phone;
private int age;
private transient String address;

public Person(String name, String phone, int age, String address) {
    this.name = name;
    this.phone = phone;
    this.age = age;
    this.address = address;
}

@Override
public String toString() {
    return "Person [name=" + name + ", phone=" + phone + ", age=" + age + ", address=" + address + "]";
}

}