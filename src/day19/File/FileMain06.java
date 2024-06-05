package day19.File;

import java.io.File;
import java.io.IOException;

public class FileMain06 {
    public static void main(String[] args) {

        // 파일 
        // 새로만들기(File) / 내용 변경 ( 다른방식)

        File file = new File("C:/java/test.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("성공");
            } else {
                System.out.println("실패");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
