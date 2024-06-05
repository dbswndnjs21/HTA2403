package day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateEx01 {
    public static void main(String[] args) {
        System.out.println("시작");

        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "12345"; 

        Connection conn  = null;
        Statement stmt = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("드라이버 로딩 성공");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스 연결 성공");

            stmt = conn.createStatement();
//          String sql = String.format("update dept2 set loc = '%s'", "부산");
            String sql = String.format("delete from dept2 where deptno = '%s'", "52");
            int result = stmt.executeUpdate(sql); // 업데이트 후 업데이트 된 열을 리턴함
            System.out.println("수정완료 " + result); // 수정 구문에 의해 수정된 열 수
        } catch (ClassNotFoundException e) {
            e.getMessage();
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            if(conn != null) try { conn.close();} catch (SQLException e ){}
            if(stmt != null) try { stmt.close();} catch (SQLException e ){}
        }
        System.out.println("끝");
    }
}
