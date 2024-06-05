package day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx03 {
    public static void main(String[] args) {
        System.out.println("시작");

        String url = "jdbc:mariadb://localhost:3306/sample";
        // 마리아디비 고정/아이피:포트/데이터베이스명
        String user = "root";
        String password = "12345"; // 암호 잘못되면 에러 남

        // java.sql에 있는 interface Connection임
        Connection conn  = null;

        // 데이터 베이스 연결을 위한 데이터 베이스 드라이버 로딩
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("드라이버 로딩 성공");

            //접속
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스 연결 성공");
        } catch (ClassNotFoundException e) {
            e.getMessage();
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            if(conn != null) try { conn.close();} catch (SQLException e ){}
        }
        System.out.println("끝");
    }
}
