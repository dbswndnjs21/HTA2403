package day35.Loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerLoopEx01 {

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;

		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			serverSocket = new ServerSocket( 7777 );
			// 항상 처리후 대기 상태
			while (true) {
				try {
					System.out.println("서버가 준비되었습니다");

					socket = serverSocket.accept(); // 대기 ( 클라이언트 키면 여기서 연결)
					System.out.println("클라이언트가 연결되었습니다.");
				}catch (IOException e ) {
					System.out.println( "[에러] " + e.getMessage() );
				}
				finally {
					if( socket != null ) try { socket.close(); } catch( IOException e ) {}
				}
			}
		} catch (IOException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( serverSocket != null ) try { serverSocket.close(); } catch( IOException e ) {}
		}
	}
}
