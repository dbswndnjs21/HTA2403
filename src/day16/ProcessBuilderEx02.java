package day16;

import java.io.IOException;

public class ProcessBuilderEx02 {
    public static void main(String[] args) {
        // 노트 패드 열기
        ProcessBuilder processBuilder = new ProcessBuilder(
                "C:\\WINDOWS\\system32\\notepad.exe");
        try {
            processBuilder.start();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
