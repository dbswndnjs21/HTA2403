package day35;

import java.io.IOException;
import java.net.*;

public class ServerSocket {
    public static void main(String[] args) {
        java.net.ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new java.net.ServerSocket(7777);
            System.out.println("서버가 준비되었습니다");

            socket = serverSocket.accept();
            System.out.println("클라리언트가 연결되었습니다");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if(socket != null) try { socket.close(); } catch (IOException e) {}
            if(serverSocket != null) try { serverSocket.close(); } catch (IOException e) {}

        }
    }
}
