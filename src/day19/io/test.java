package day19.io;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("단수를 입력해주세요");
        int num = Integer.parseInt(br.readLine());

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("./test" + num + ".txt"); 

            // byte 여서 char로 해야함 아스키 코드 써야하네2ㅈ
            for (int i = 1; i <= 9; i++) {
                fos.write(num + 48);
                fos.write(' ');
                fos.write('X');
                fos.write(' ');
                fos.write(i + 48);
                fos.write(' ');
                fos.write('=');
                fos.write(' ');

                int sum = num * i;
                if (sum > 10) {
                    fos.write(sum / 10 + 48);
                    fos.write(sum % 10 + 48);
                } else {
                    fos.write(sum + 48);
                }
                fos.write('\n');
            }

            System.out.println("출력 완료");
        } catch (FileNotFoundException e) {
                    
        } catch (IOException e ) {

        } finally {
            try {
                fos.close();
            } catch (IOException e) {
            }
        }
    }
}
