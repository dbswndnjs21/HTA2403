package day33.inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress1 = InetAddress.getByName("www.daum.net");
            System.out.println(inetAddress1.getHostName());
            System.out.println(inetAddress1.getHostAddress());

            InetAddress[] inetAddresses1 = InetAddress.getAllByName("www.naver.com");
            for (InetAddress intAddress : inetAddresses1) {
                System.out.println(intAddress.getHostAddress());
            }

        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        }
    }
}
