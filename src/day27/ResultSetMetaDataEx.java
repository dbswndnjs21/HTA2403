package day27;

import java.sql.*;

public class ResultSetMetaDataEx {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "12345";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");

            conn = DriverManager.getConnection(url, user, password);

            String sql = "select * from emp";
            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            // 컬럼에 대한 정보
            System.out.println(rsmd.getColumnCount());
            System.out.println(rsmd.getTableName(1));
            //번호가 칼럼의 순서
            System.out.println(rsmd.getColumnName(1));

            //전체 다 가져오기
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.println(rsmd.getColumnName(i));
                System.out.println(rsmd.getColumnTypeName(i));

                System.out.println(rsmd.getPrecision(i));
                System.out.println(rsmd.getScale(i));

                System.out.println(rsmd.isNullable(i));
            }

        } catch (ClassNotFoundException e) {
            e.getMessage();
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            if(conn != null) try {conn.close();} catch (SQLException e) {}
            if(pstmt != null) try {pstmt.close();} catch (SQLException e) {}
            if(rs != null) try {rs.close();} catch (SQLException e) {}
        }


    }
}
