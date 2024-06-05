package day19.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoMain03 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            // 파일 없으면 자동 생성 // 파일이 있으면 재생성
            //
            fos = new FileOutputStream("./test2.txt");
            // 파일에 쓰기
            fos.write('1');
            fos.write('2');
            fos.write('\n');
            fos.write('1');
            fos.write('2');


            System.out.println("출력완료");
        } catch (FileNotFoundException e) {
            System.out.println("[에러] " + e.getMessage());
        } catch (IOException e) {
            System.out.println("[에러] " + e.getMessage());
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
            }
        }
    }
}
