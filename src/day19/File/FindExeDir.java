package day19.File;

import java.io.File;

public class FindExeDir {
    public static void main(String[] args) {
        // 파일 리스트들을 디렉토리면 [] 안에 출력 
        // 파일이면 그냥 출력
        File f1 = new File("c:/java");
        File[] files = f1.listFiles(); // File객체 배열에 담는 이유는
        // 문자열 배열은 파일과 디렉토리만 담겨있고 -> 이름만 필요할때 사용하면 적합
        // File 객체 배열엔 파일과 디렉토리의 자세한 정보가 담겨있음

        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("[ " + file.getName() + " ]");
            } else {
                System.out.println(file.getName());
            }
        }
    }
}
