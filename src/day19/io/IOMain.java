package day19.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOMain {
    public static void main(String[] args) {
        // IO
        // Stream
        // byte 기반     --XXXInputStream  / XXXOutputStream
        // 다국어 이외에 모든 문자를 저장 - File / 바이너리 - 이미지, 실행파일 ,음악 ..
        // character      -- XXXReader / XXXWriter
        // 다국어를 포함한 모든 문자를 저장 - File
        // 2차(보조)스트림 '

        File file = new File("C:\\Users\\jhta\\IdeaProjects\\CodingTest\\src\\day19\\io\\test.txt");
        System.out.println(file.exists());

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\jhta\\IdeaProjects\\CodingTest\\src\\day19\\io\\test.txt");

            int data = fis.read();
            System.out.println((char) data);
            data = fis.read();
            System.out.println((char) data);
            data = fis.read();
            System.out.println((char) data);

        } catch (FileNotFoundException e) {
            System.out.println("[에러]" + e.getMessage());
        } catch (IOException e) {
            System.out.println("[에러]" + e.getMessage());
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
            }
        }


    }
}
