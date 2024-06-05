package day35.pack5;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Socket socket = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			System.out.println("클라이언트와 연결 합니다.");
			
			socket = new Socket("localhost",7777);
			System.out.println("클라이언트와 연결 되었습니다.");
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"));
			
			String msg = br.readLine().replaceAll("단","");
			System.out.println("클라이언트에서 보낸 메시지 : " + msg  + "단");

			StringBuilder sb = new StringBuilder();
			for (int i = 1; i <= 9; i++) {
				sb.append(msg + " X " + i + " = " + (Integer.parseInt(msg) * i ));
				if (i != 9) {
					sb.append( ":");
				} else {
					break;
				}
			}
			System.out.println(sb.toString());
			bw.write(sb.toString() + System.lineSeparator());
			bw.flush(); //스트림 비우는 문법
			
			System.out.println("전송 완료");
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]"+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러]"+e.getMessage());
		}finally {
			if(br != null)try {br.close();}catch(IOException e) {}
			if(bw != null)try {bw.close();}catch(IOException e) {}
			
			if(socket != null)try {socket.close();}catch(IOException e) {}
		}
		
	}

}
