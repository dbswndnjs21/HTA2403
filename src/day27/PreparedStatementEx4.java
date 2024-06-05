package day27;

import java.sql.*;

public class PreparedStatementEx4 {
    public static void main(String[] args) {
        // 데이터베이스 연결 정보
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "12345";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            //  값이 들어가는 부분을 ? 로 처리
            String sql = "select deptno, dname, loc from dept2 where dname = ?";
            pstmt = conn.prepareStatement(sql);

            // ? 순서 대로 값 넣기
            pstmt.setString(1, "개발부");

            rs = pstmt.executeQuery(); //  prepared 는 sql 이 안들어감

            while (rs.next()) {
                String result = String.format("%s %s %s",
                        rs.getString("deptno"),
                        rs.getString("dname"),
                        rs.getString("loc")
                );
                System.out.println(result);
            }

        } catch (ClassNotFoundException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } catch (SQLException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e) {}
            if (conn != null) try { conn.close(); } catch (SQLException e) {}
            if (rs != null) try { rs.close(); } catch (SQLException e) {}
        }

    }
}
