package day27;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class lotto {

    public static void main(String[] args) {
        // 데이터베이스 연결 정보
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "12345";

        Connection conn = null;
        PreparedStatement pstmt = null;
        Workbook workbook = null;

        try {
                workbook = Workbook.getWorkbook(new FileInputStream("C:\\lotto(1119).xls"));
                Sheet sheet = workbook.getSheet(0);
                // MariaDB JDBC 드라이버 로드
                Class.forName("org.mariadb.jdbc.Driver");
                // 데이터베이스 연결
                conn = DriverManager.getConnection(url, user, password);

                // PreparedStatement 생성
                String insertSQL = "INSERT INTO lottotbl (seq,n1,n2,n3,n4,n5,n6,n7,wdate) VALUES (?,?,?,?,?,?,?,?,?)";
                pstmt = conn.prepareStatement(insertSQL);


                    for(int row = 4; row < sheet.getRows(); row++) {
                        Cell turn = sheet.getCell(2 - 1, row - 1);
                        Cell num1 = sheet.getCell(14 - 1, row - 1);
                        Cell num2 = sheet.getCell(15 - 1, row - 1);
                        Cell num3 = sheet.getCell(16 - 1, row - 1);
                        Cell num4 = sheet.getCell(17 - 1, row - 1);
                        Cell num5 = sheet.getCell(18 - 1, row - 1);
                        Cell num6 = sheet.getCell(19 - 1, row - 1);
                        Cell num7 = sheet.getCell(20 - 1, row - 1);
                        Cell wdate = sheet.getCell(3 - 1, row - 1);

                        pstmt.setInt(1, Integer.parseInt(turn.getContents())); // zipcode
                        pstmt.setInt(2, Integer.parseInt(num1.getContents())); // sido
                        pstmt.setInt(3, Integer.parseInt(num2.getContents())); // gugun
                        pstmt.setInt(4, Integer.parseInt(num3.getContents())); // dong
                        pstmt.setInt(5, Integer.parseInt(num4.getContents())); // ri
                        pstmt.setInt(6, Integer.parseInt(num5.getContents())); // bunji
                        pstmt.setInt(7, Integer.parseInt(num6.getContents())); // seq
                        pstmt.setInt(8, Integer.parseInt(num7.getContents())); // seq
                        pstmt.setString(9, wdate.getContents()); // seq

                        pstmt.executeUpdate();
                    }

                System.out.println("CSV 파일의 데이터를 데이터베이스에 성공적으로 삽입했습니다.");
            } catch (BiffException e) {
                System.out.println(e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                // 자원 해제
                if (pstmt != null) try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if (conn != null) try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (workbook != null) {
                workbook.close();
            }
            }
        }
    }
