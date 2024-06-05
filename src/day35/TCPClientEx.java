package day35;

import java.io.IOException;
import java.net.Socket;

public class TCPClientEx {
    public static void main(String[] args) {
        Socket socket = null;

        try {
            System.out.println("서버와 연결합니다");

            socket = new Socket("localhost", 7777);
            System.out.println("서버와 연결 되었습니다");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if(socket != null) try { socket.close(); } catch (IOException e) {}
        }
    }
}
