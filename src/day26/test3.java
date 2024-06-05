package day26;

import java.sql.*;

public class test3 {
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
            String sql = "select * from emp";
            rs = stmt.executeQuery(sql);

            // 커서의 이동
            // rs.next()
            // rs.absolute(행번호)
            // rs.beforeFirst() - 커서 위치 초기화
            // rs.first() 첫번째
            // rs.last() 마지막
            // rs.previous() 이전
            // rs.getRow 데이터 갯수

            rs.absolute(1);
            System.out.printf("%s\t%s%n", rs.getString("empno"), rs.getString("ename"));
            rs.absolute(10); // 10번째 데이터
            System.out.printf("%s\t%s%n", rs.getString("empno"), rs.getString("ename"));

            rs.previous(); // 9번째
            System.out.printf("%s\t%s%n", rs.getString("empno"), rs.getString("ename"));

            rs.next(); // 다시 10번째
            System.out.printf("%s\t%s%n", rs.getString("empno"), rs.getString("ename"));

            rs.last(); // 마지막 데이터
            System.out.printf("%s\t%s%n", rs.getString("empno"), rs.getString("ename"));
//            System.out.println(rs.getRow()); // 14줄
            // select count(*) from 테이블명; 하면 테이블 전체 데이터 갯수

            // 커서 초기화
            rs.beforeFirst();
            rs.next(); // 다시 처음으로
            System.out.printf("%s\t%s%n", rs.getString("empno"), rs.getString("ename"));


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
