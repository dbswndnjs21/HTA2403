package day27;

import java.sql.*;

public class CopyTableData {

    public static void main(String[] args) {

        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "12345";

        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        ResultSet rs = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            String sql = "select * from emp where deptno = ?";

            pstmt1 = conn.prepareStatement(sql);
            pstmt1.setString(1, "10");

            rs = pstmt1.executeQuery();
            while(rs.next()) {
                String empno = rs.getString("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                String mgr = rs.getString("mgr");
                String hiredate = rs.getString("hiredate");
                String sal = rs.getString("sal");
                String comm = rs.getString("comm");
                String deptno = rs.getString("deptno");

                // sql문에서의 문법과 맞아야한다.
                String insertSQL = "insert into emp1 values(?, ?, ?, ?, ?, ?, ?,?)";
                pstmt2 = conn.prepareStatement(insertSQL);

                pstmt2.setString(1, empno);
                pstmt2.setString(2, ename);
                pstmt2.setString(3, job);
                pstmt2.setString(4, mgr);
                pstmt2.setString(5, hiredate);
                pstmt2.setString(6, sal);
                pstmt2.setString(7, comm);
                pstmt2.setString(8, deptno);

                int result = pstmt2.executeUpdate();

            }

            System.out.println("백업 완료");

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("[에러]" + e.getMessage());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("[에러]" + e.getMessage());
        } finally {
            if(rs != null) try {rs.close();} catch(SQLException e) {}
            if(pstmt1 != null) try {pstmt1.close();} catch(SQLException e) {}
            if(pstmt2 != null) try {pstmt2.close();} catch(SQLException e) {}
            if(conn != null) try {conn.close();} catch(SQLException e) {}
        }

    }

}