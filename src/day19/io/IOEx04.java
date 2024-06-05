package day19.io;

import java.io.*;

public class IOEx04 {
    public static void main(String[] args) {
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("./text2.txt"));

            bw.write("Hello World");
            bw.write("\n");
            bw.write("Hello World");
            bw.write(System.lineSeparator()); // 시스템에서 가져온 엔터값
            bw.write("Hello World");
            bw.newLine();
            bw.write("Hello World");

            System.out.println("출력 완료");
            
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

