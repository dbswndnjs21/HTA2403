package day19.File;

import java.io.File;
import java.io.IOException;

public class FileMain2 {
    public static void main(String[] args) {
        // 절대 경로
        File f1 = new File("c:/java/eclipse/eclipse.exe");

        //상대 경로
        File f2 = new File("../../eclipse/eclipse.exe");

        System.out.println(f1.getName());
        System.out.println(f2.getName());

        System.out.println(f1.getParent());
        System.out.println(f2.getParent());

        System.out.println(f1.getPath());

        // 절대 경로로 변경해주기
        try {
            System.out.println(f1.getCanonicalFile());
            System.out.println(f2.getCanonicalFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
