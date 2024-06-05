package day35.Loop;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerLoopEx02 {

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;

		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			serverSocket = new ServerSocket( 7777 );
			while (true) {
				try {
					System.out.println("서버가 준비되었습니다");

					socket = serverSocket.accept(); // 대기 ( 클라이언트 키면 여기서 연결)
					System.out.println("클라이언트가 연결되었습니다.");

					br = new BufferedReader( new InputStreamReader( socket.getInputStream(), "utf-8" ) );
					bw = new BufferedWriter( new OutputStreamWriter( socket.getOutputStream(), "utf-8" ) );

					String strDan = br.readLine().replaceAll( "단", "" );
					System.out.println( "구구단 생성 : " + strDan );

					StringBuilder sbResult = new StringBuilder();
					for( int i=1 ; i<=9 ; i++ ) {
						sbResult.append( strDan + " X " + i + " = " + ( Integer.parseInt( strDan ) * i ) + ":" );
					}

					bw.write( sbResult.toString() + System.lineSeparator() );
					bw.flush();

					System.out.println( "전송 완료" );

				}catch (IOException e ) {
					System.out.println( "[에러] " + e.getMessage() );
				}
				finally {
					if( socket != null ) try { socket.close(); } catch( IOException e ) {}
					if( br != null ) try { br.close(); } catch( IOException e ) {}
					if( bw != null ) try { bw.close(); } catch( IOException e ) {}
				}
			}
		} catch (IOException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( serverSocket != null ) try { serverSocket.close(); } catch( IOException e ) {}
		}
	}
}
