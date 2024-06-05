package day26;

import java.sql.*;

public class ResultSetEx01 {
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
            //반듯이 next를 한번 해줘야 볼수있음  ( 커서 위치가 제일 위에 있기 때문에)
            rs.next();
            //행에 접근하기 위해선 컬럼 이름 값을 넣는다
            System.out.println(rs.getString("deptno")); 
            System.out.println(rs.getString("dname"));
            System.out.println(rs.getString("loc"));

            //다음줄
            rs.next();
            System.out.println(rs.getString("deptno"));
            System.out.println(rs.getString("dname"));
            System.out.println(rs.getString("loc"));

            rs.next();
            // 숫자로도 가능 첫번째 두번째 세번째 컬럼
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));


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
