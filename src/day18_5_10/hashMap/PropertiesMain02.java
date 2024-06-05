package day18_5_10.hashMap;

import java.util.Properties;
import java.util.Set;

public class PropertiesMain02 {
    public static void main(String[] args) {

        Properties props = System.getProperties();

        Set<String> names = props.stringPropertyNames();
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(props.getProperty("java.runtime.version"));
        // 자바 버전이 나옴 -> 응용 : 자바 버전이 안맞으면 튕기게 가능
    }
}
