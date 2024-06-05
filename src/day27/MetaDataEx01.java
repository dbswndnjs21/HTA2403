package day27;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MetaDataEx01 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "12345";

        Connection conn = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");

            conn = DriverManager.getConnection(url, user, password);

            DatabaseMetaData dmd = conn.getMetaData();

            // data base 에 대한 정보
            System.out.println(dmd.getDatabaseProductName());
            System.out.println(dmd.getDatabaseProductVersion());
            
            // 드라이버
            System.out.println(dmd.getDriverName());
            System.out.println(dmd.getDriverVersion());

            // 접속 정보
            System.out.println(dmd.getURL());
            System.out.println(dmd.getUserName());

        } catch (ClassNotFoundException e) {
            e.getMessage();
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            if(conn != null) try {conn.close();} catch (SQLException e) {}
        }

    }
}
