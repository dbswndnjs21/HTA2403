package day33.inetAddress;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.StringTokenizer;

public class URLEx2 {
    public static void main(String[] args) {
        String strUrl = "http://www.codechobo.com:80/sample/hello.html?reference=codechobo#index1";

        // 프로토콜 : http
        // 호스트명 : www.codechobo.com
        // 포트명 : 80

        // URL 클래스 사용해서 자르기
        try {
            URL url = new URL(strUrl);
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPort());
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }
}
