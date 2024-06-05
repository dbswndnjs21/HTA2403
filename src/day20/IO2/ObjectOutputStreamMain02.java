package day20.IO2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamMain02 {
    public static void main(String[] args) {

//        String str = new String("홍길동");

        // 사용자 정의 클래스
        Person p = new Person("홍길동", "010-1111-1111", 20, "서울시");
        
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("./serial.ser"));

            oos.writeObject(p);
//            oos.writeObject(str);

            System.out.println("저장 완료");
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {

            }
        }
    }
}
