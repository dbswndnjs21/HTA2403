package day26;

import java.sql.*;

public class test {
    public static void main(String[] args) {

        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "12345";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        //드라이버 로딩
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            stmt = conn.createStatement();
            String sql = "select empno, ename, sal, (NVL(comm,0) + sal *12) as yearsal from emp where deptno = 10";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.printf("사원번호 %s\t 사원이름 %s\t 급여%s\t 연봉 %s%n",
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
            }

        } catch (ClassNotFoundException e) {
            e.getMessage();
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            if (conn != null) try {conn.close();} catch (SQLException e) {}
            if (stmt != null) try {stmt.close();} catch (SQLException e) {}
            if (rs != null) try {rs.close();} catch (SQLException e) {}

        }

    }
}
