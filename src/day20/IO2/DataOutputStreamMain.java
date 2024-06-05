package day20.IO2;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamMain {
    public static void main(String[] args) {
        DataOutputStream dos = null;

        try {
            // 2차 스트림
            dos = new DataOutputStream(new FileOutputStream("./data.dat"));

            dos.writeInt(2024);
            dos.writeUTF("UTF-8 형식으로 저장");
            dos.writeFloat(1.8f);

            System.out.println("저장 완료");
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                dos.close();
            } catch (IOException e) {
            }
        }
    }
}
