package day20.IO;

import java.io.*;

public class IOMain04 {
    public static void main(String[] args) {
        BufferedWriter bw = null;

        try {
//            bw = new BufferedWriter(new FileWriter("./test1.txt"));
            bw = new BufferedWriter(new FileWriter("./test1.txt",true));

            bw.write("안녕 스트링");
            bw.write(System.lineSeparator());
            bw.write("안녕 스트링");
            bw.write(System.lineSeparator());
            System.out.println("출력 완료");

            // 여긴 FileNotFoundException 없음
        } catch (IOException e) {
            e.getMessage();

        } finally {
            try {
                bw.close();
            } catch (IOException e) {
            }
        }
    }
}


