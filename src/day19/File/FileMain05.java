package day19.File;

import java.io.File;

public class FileMain05 {
    public static void main(String[] args) {
        // 디렉토리 생성 변경 삭제

        File file = new File("c:/java/dir1");
        File file2 = new File("c:/java/dir2");

        if (file2.delete()) {
//      if (file.renameTo(file2)) { //이름 file2로 변경
//        if (file.mkdir()) {      // 파일 생성 ( 있으면 실패함)
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }
    }
}
