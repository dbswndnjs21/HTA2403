package day35.pack2;
// 단순한 문자 보내기

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ServerSocket = 포트를 열고 대기하는 프로그램
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		
		BufferedWriter bw = null;
		
		try {
			serverSocket = new ServerSocket( 7777 );
			System.out.println("서버가 준비되었습니다");
			
			socket = serverSocket.accept();
			System.out.println("클라이언트가 연결되었습니다.");
			
			//소켓에 다국어를 보낼수있게끔 가속화
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			bw.write("socket" + System.lineSeparator());
			
			System.out.println("전송완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]"+e.getMessage());
		}finally {
			if(bw != null)try {bw.close();}catch(IOException e) {}
			
			if(socket != null)try {socket.close();}catch(IOException e) {}
			if(serverSocket != null)try {serverSocket.close();}catch(IOException e) {}
		}
	}

}
