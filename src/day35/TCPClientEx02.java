package day35;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClientEx02 {
    public static void main(String[] args) {

        Socket socket = null;
        BufferedReader br = null;

        try {
            System.out.println("서버와 연결 합니다");

            socket = new Socket("192.168.0.27", 7777);
            System.out.println("서버와 연결 되었습니다.");

            br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
            System.out.println("서버에서 보낸 메시지" + br.readLine());

        } catch (IOException e) {
            System.out.println("[에러]" + e.getMessage());
        } finally {
            if(br != null)try{br.close();}catch (IOException e){}
            if(socket != null)try{socket.close();}catch (IOException e){}
        }
    }
}
