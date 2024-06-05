package day16;

import java.io.IOException;

public class ProcessBuilderEx01 {
    public static void main(String[] args) {
        // windows 내부의 프로그램 실행
        // 프로그램의 위치를 파악해야한다
        // C:\Program Files\Google\Chrome\Application\chrome.exe (크롬의 위치)

        ProcessBuilder processBuilder = new ProcessBuilder(
                "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe","www.google.com");
        try {
            processBuilder.start();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
