package day26;

import java.sql.*;

public class test4 {
    public static void main(String[] args) {

        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "12345";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            stmt = conn.createStatement();
            String sql = "insert into emp_10 select * from emp where deptno = 10;";
            stmt.executeUpdate(sql);
            String sql2 = "select * from emp_10";
            rs = stmt.executeQuery(sql2);

            while (rs.next()) {
                System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%n",
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)
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
