package day27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class ZipcodeSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String url = "jdbc:mariadb://localhost:3306/project";
        String user = "project";
        String password = "123456";

        String str = br.readLine();

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            stmt = conn.createStatement();
            String sql = "select * from zipcode where dong like \"%" + str + "%\" ";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String zipcode = rs.getString("zipcode");
                String sido = rs.getString("sido");
                String gugun = rs.getString("gugun");
                String dong = rs.getString("dong");
                String ri = rs.getString("ri");
                String bunji = rs.getString("bunji");

                String result = String.format("[%s] %s %s %s %s %s",
                        zipcode, sido, gugun, dong, ri, bunji
                );
                System.out.println(result);

            }
        } catch (ClassNotFoundException e) {
            System.out.println("에러 : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("에러 : " + e.getMessage());
        } finally {
        } if(rs!= null) try { rs.close();} catch (SQLException e ) {}
         if(stmt != null) try { stmt.close();} catch (SQLException e ) {}
         if(conn != null) try { conn.close();} catch (SQLException e ) {}
    }
}
