package day26;

import java.sql.*;

public class ResultSetEx02 {
    public static void main(String[] args) {
        System.out.println("시작");

        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "12345"; 

        Connection conn  = null;
        Statement stmt = null;
        // ResultSet 객체 추가 및 import
        ResultSet rs = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("드라이버 로딩 성공");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스 연결 성공");

            stmt = conn.createStatement();
            String sql = "select * from dept2";

            rs = stmt.executeQuery(sql);

            //끝까지 읽기
            while (rs.next()) {
                System.out.printf("%s\t%s\t%s%n",
                        rs.getString("deptno"),
                        rs.getString("dname"),
                        rs.getString("loc"));
            }

            //한줄읽기
            if (rs.next()) {
                System.out.printf("%s\t%s\t%s%n",
                        rs.getString("deptno"),
                        rs.getString("dname"),
                        rs.getString("loc"));
            }

        } catch (ClassNotFoundException e) {
            e.getMessage();
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            if(conn != null) try { conn.close();} catch (SQLException e ){}
            if(stmt != null) try { stmt.close();} catch (SQLException e ){}
            if(rs != null) try { rs.close();} catch (SQLException e ){}
        }
        System.out.println("끝");
    }
}
