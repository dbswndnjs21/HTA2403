package day20.IO2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesMain01 {
    public static void main(String[] args) {
        
        //Properties
        // hashMap 컬렉션 가지고있는 임지 저장소

        Properties props = new Properties();
        props.setProperty("id", "andy");
        props.setProperty("password", "1234");
        props.setProperty("grade", "d");

        System.out.println(props);

        FileWriter fw = null;

        try {
            fw = new FileWriter("./config.properties");
            props.store(fw, "System Config");
            System.out.println("저장완료");
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
            }
        }
    }
}
