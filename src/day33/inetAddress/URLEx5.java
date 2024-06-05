package day33.inetAddress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx5 {
    public static void main(String[] args) {
        // url로 접속해서 html 문서 읽어오기

        // url / io 연결

        try {
            BufferedReader br = null;

            URL url = new URL("https://m.daum.net");
            br = new BufferedReader(new InputStreamReader(url.openStream()));

            /*int data= 0 ;
            while ((data = br.read()) != -1) {
                System.out.print((char)data);
            }*/

            String line = null;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
