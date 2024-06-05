package day19.File;

import java.io.File;
import java.util.Date;

public class FileMain3 {
    public static void main(String[] args) {

        File f1 = new File("c:/java/eclipse-jee-2024-03-R-win32-x86_64.zip");

        if (f1.exists()) {
            System.out.println("파일 존재");
            // length
            // byte - kbyte - mbyte - gbyte
            long fileSize = f1.length();
            System.out.println(fileSize); // 기본 단위는 byte
            System.out.println(fileSize / 1024); // int
            System.out.println(fileSize / 1024.); // double

            // lastModified - timpestamp -> 날짜
            long fileDate = f1.lastModified();
            System.out.println(fileDate);
            System.out.println(new Date(fileDate).toLocaleString()); // 파일의 생성날짜

        } else {
            System.out.println("파일 부존재");
        }
    }
}
