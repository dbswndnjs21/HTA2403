package day27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementEx3 {
    public static void main(String[] args) {
        // 데이터베이스 연결 정보
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "12345";

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");

            conn = DriverManager.getConnection(url, user, password);

            //  값이 들어가는 부분을 ? 로 처리
            String sql = "delete from dept2 where deptno = ?";
            pstmt = conn.prepareStatement(sql);

            // ? 순서 대로 값 넣기
            pstmt.setString(1, "96");

            int result = pstmt.executeUpdate();
            System.out.println("[쿼리 성공] " + result);
        } catch (ClassNotFoundException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } catch (SQLException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e) {}
            if (conn != null) try { conn.close(); } catch (SQLException e) {}
        }

    }
}
