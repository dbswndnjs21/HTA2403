package day35.pack1;
// 클라이언트 작동

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Socket socket = null;
		
		try {
			System.out.println("서버와 연결 합니다.");
			
			socket = new Socket("localhost",7777);
			System.out.println("서버와 연결 되었습니다.");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]"+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]"+e.getMessage());
		}finally {
			if(socket != null)try {socket.close();}catch(IOException e) {}
		}
		
	}

}
