package day35.Loop;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientLoopEx02 {

	public static void main(String[] args) {

		Socket socket = null;

		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try {
			br = new BufferedReader( new InputStreamReader( System.in ) );
			System.out.print( "단수 > " );
			String strDan = br.readLine();
			System.out.println( "서버와 연결합니다." );
			
			socket = new Socket( "localhost", 7777 );
			System.out.println( "서버와 연결되었습니다." );

			bw = new BufferedWriter( new OutputStreamWriter( socket.getOutputStream(), "utf-8" ) );
			br = new BufferedReader( new InputStreamReader( socket.getInputStream(), "utf-8" ) );

			bw.write( strDan + System.lineSeparator() );
			bw.flush();

			System.out.println( br.readLine().replaceAll( ":", "\n" ) );
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
