package day19.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOMain02 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\jhta\\IdeaProjects\\CodingTest\\src\\day19\\io\\test.txt");

            int data = 0;
            // 파일 끝까지
            // 다국어 읽지 못함
            // 엔터키나 탭키도 문자임
            while ((data = fis.read()) != -1) {
                //System.out.print((char) data);
                if (data == '\n') {
                    System.out.print("(n)");
                } else {
                    System.out.print((char) data);
                }
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println("[에러] " + e.getMessage());
        } catch (IOException e) {
            System.out.println("[에러] " + e.getMessage());
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
            }
        }
    }
}
