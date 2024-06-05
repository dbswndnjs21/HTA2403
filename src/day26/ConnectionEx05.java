package day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionEx05 {
    public static void main(String[] args) {
        System.out.println("시작");

        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "12345"; 

        Connection conn  = null;
        // insert하기 위해서 만듬
        Statement stmt = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("드라이버 로딩 성공");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스 연결 성공");

            stmt = conn.createStatement();
            String deptno = "52";
            String dname = "연구부";
            String loc = "대전";
//            String sql = "insert into dept2 values( " + deptno + ",'"+ dname + "','" + loc + "')";
            String sql = String.format("insert into dept2 values (%s,'%s','%s')", deptno, dname, loc);
            stmt.executeUpdate(sql);
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
