package day35.pack4;
// 서버와 클라이언트 값 주고 받아
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ServerSocket = 포트를 열고 대기하는 프로그램
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		
		BufferedWriter bw = null;
		BufferedReader br = null;
		try {
			serverSocket = new ServerSocket( 7777 );
			System.out.println("서버가 준비되었습니다");
			
			socket = serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			
			//소켓에 다국어를 보낼수있게끔 가속화
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
			
			bw.write("반사" + System.lineSeparator());
			bw.flush();//
			
			System.out.println("전송완료");
			
			String msg = br.readLine();
			System.out.println("전송 메시지 : " + msg);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]"+e.getMessage());
		}finally {
			if(bw != null)try {bw.close();}catch(IOException e) {}
			if(br != null)try {br.close();}catch(IOException e) {}
			
			if(socket != null)try {socket.close();}catch(IOException e) {}
			if(serverSocket != null)try {serverSocket.close();}catch(IOException e) {}
		}
	}

}
