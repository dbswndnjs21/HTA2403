package day33.inetAddress;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx4 {
    public static void main(String[] args) {
        // url로 접속해서 html 문서 읽어오기

        // url / io 연결

        try {
            InputStreamReader isr = null;

            URL url = new URL("https://m.daum.net");
            isr = new InputStreamReader(url.openStream());

            int data= 0 ;
            while ((data = isr.read()) != -1) {
                System.out.print((char)data);
            }

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
