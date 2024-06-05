package day35.pack1;
// 단순 서버 키기

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ServerSocket = 포트를 열고 대기하는 프로그램
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			//대기 할 포트 설정
			serverSocket = new ServerSocket( 7777 );
			System.out.println("서버가 준비되었습니다");
			
			//요청 대기
			socket = serverSocket.accept();
			System.out.println("클라이언트가 연결되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]"+e.getMessage());
		}finally {
			if(socket != null)try {socket.close();}catch(IOException e) {}
			if(serverSocket != null)try {serverSocket.close();}catch(IOException e) {}
		}
	}

}
