package day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx01 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("시작");

        // 데이터 베이스 연결을 위한 데이터 베이스 드라이버 로딩
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("드라이버 로딩 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("[에러] 드라이버 로딩 실패");
            e.printStackTrace();
        }

        String url = "jdbc:mariadb://localhost:3306/sample";
                    // 마리아디비 고정/아이피:포트/데이터베이스명
        String user = "root";
        String password = "12345"; // 암호 잘못되면 에러 남

        // java.sql에 있는 interface Connection임
        Connection conn  = null;

        //접속
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스 연결 성공");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // 반듯이 끊어줘야함
            if (conn !=null) try {conn.close(); } catch (SQLException e) {};
        }

        System.out.println("끝");

    }
}
