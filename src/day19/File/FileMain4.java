package day19.File;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class FileMain4 {
    public static void main(String[] args) {
        // 디렉토리 내부의 목록 ( 자식 디렉토리나 파일들)
        // list -> 문자열 목록
        // listFiles() -> 파일 객체  목록

        File file1 = new File("c:/java");
        // 배열로 받아야함
        String[] lists = file1.list();
        System.out.println(Arrays.toString(lists));

        for (String list : lists) {
            System.out.println(list);
        }

        File[] listFiles = file1.listFiles();

        for (File listFile : listFiles) {
            System.out.println(listFile.getName());
        }
        
    }
}
