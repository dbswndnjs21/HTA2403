package day20.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOMain02 {
    public static void main(String[] args) {
        FileOutputStream fos = null;

        try {
            //append 모드 (추가)
            fos = new FileOutputStream("./test1.txt", true);

            fos.write('a');
            fos.write('b');
            fos.write('\n');

            System.out.println("출력완료");
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
            }
        }
    }
}
