package day20.IO;

import java.io.*;

public class ZipcodeSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader brInput = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = null;

        try {
            String data;
            while (true) {
                // br의 초기화 위치가 여기여야 무한으로 검색이 가능함
                br = new BufferedReader(new FileReader("./zipcode_seoul_utf8_type2.csv"));
                System.out.println("검색어를 입력하세요 ");
                String findStr = brInput.readLine();

                if ("q".equals(findStr)) {
                    System.out.println("프로그램을 종료합니다");
                    break;
                }

                while ((data = br.readLine()) != null) {
                    if (data.contains(findStr)) {
                        String[] strArr = data.split(",");
                        System.out.println(" [ " + strArr[0] + " ] " + strArr[1] + " " + strArr[2] + " " + strArr[3] + " " + strArr[4] + " " + strArr[5]);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
            }
        }
    }
}
