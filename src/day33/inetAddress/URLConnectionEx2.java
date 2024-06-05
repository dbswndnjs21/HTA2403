package day33.inetAddress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx2 {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            URLConnection conn = new URL("https://m.daum.net").openConnection();

            br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(br != null) try { br.close();} catch (IOException e ) {}
        }
    }
}
