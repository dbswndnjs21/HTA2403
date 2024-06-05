package day26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class SearchZipcode {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String url = "jdbc:mariadb://localhost:3306/project";
        String user = "project";
        String password = "123456";

        Connection conn = null;
        Statement stmt = null;
        
        ResultSet rs = null;

        System.out.println("검색할 동을 입력해 주세요");
        String str = br.readLine();
        
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            stmt = conn.createStatement();
            String sql = "select * from zipcode where dong like \"%" + str + "%\" ";
            rs = stmt.executeQuery(sql);

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
