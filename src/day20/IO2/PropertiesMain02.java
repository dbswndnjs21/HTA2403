package day20.IO2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesMain02 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("./config.properties");

            Properties props = new Properties();
            props.load(fr);

            Set<String> keys = props.stringPropertyNames();
            for (String key : keys) {
                System.out.println(key + " : " + props.getProperty(key));
            }

//            System.out.println(props);
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
            }
        }

    }
}
