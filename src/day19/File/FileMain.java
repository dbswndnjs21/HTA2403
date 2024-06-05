package day19.File;

import java.io.File;

public class FileMain {
    public static void main(String[] args) {

        //  디렉토리
        File dir1 = new File("c:\\java\\eclipse");
        File dir2 = new File("c:/java/eclipse");
        File dir21 = new File("c:/java/eclipse1");
        File dir22 = new File("c:/java/eclipse/eclipse.exe");


        // exist()  존재여부 확인
        System.out.println(dir1.exists()); //true
        System.out.println(dir21.exists()); //false


        // 디렉토리인지 file인지
        // isDirectory() isFile()
        System.out.println(dir22.isFile()); //true

        // canExecute / canRead / canWrite - permission
        System.out.println(dir22.canExecute()); //true
        System.out.println(dir22.canWrite()); //true

        // isHidden 숨김파일 여부
        File f23 = new File("c:/java/test.txt");
        System.out.println(f23.isHidden());

    }
}
