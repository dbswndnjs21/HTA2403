package day35.newPack;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientLoopEx01 {

	public static void main(String[] args) {

		Socket socket = null;
		
		try {
			System.out.println( "서버와 연결합니다." );
			
			socket = new Socket( "localhost", 7777 );
			System.out.println( "서버와 연결되었습니다." );

			System.out.println("전송 완료");
			
		} catch (UnknownHostException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( socket != null ) try { socket.close(); } catch( IOException e ) {}
		}
	}
}
