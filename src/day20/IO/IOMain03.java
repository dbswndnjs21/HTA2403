package day20.IO;

import java.io.*;

public class IOMain03 {
    public static void main(String[] args) {
        BufferedOutputStream bos = null;
        try {
//            bos = new BufferedOutputStream(new FileOutputStream("./test1.txt"));
            bos = new BufferedOutputStream(new FileOutputStream("./test1.txt"),1024); // 출력을 1024 바이트로 쓸수있다

            bos.write('a');
            bos.write('b');
            bos.write('\n');

            System.out.println("출력완료");
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                bos.close();
            } catch (IOException e) {
            }
        }
    }
}
