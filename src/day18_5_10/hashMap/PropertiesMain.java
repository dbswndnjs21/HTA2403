package day18_5_10.hashMap;

import java.util.Properties;
import java.util.Set;

public class PropertiesMain {
    public static void main(String[] args) {

        // 해쉬맵이라는디 ?
        Properties props = new Properties();
        props.setProperty("timeout", "30");
        props.setProperty("language", "Kr");
        props.setProperty("size", "10");

        System.out.println(props);
        System.out.println(props.size());

        props.setProperty("language", "us");
        System.out.println(props);

        System.out.println(props.getProperty("timeout"));

        Set<String> names = props.stringPropertyNames(); //[size, language, timeout]를 names에 담기
        for (String name : names) {
            System.out.println(name);
        }
    }
}
