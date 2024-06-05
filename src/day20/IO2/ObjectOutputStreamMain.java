package day20.IO2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamMain {
    public static void main(String[] args) {
        //배열
        String[] names = {"홍길동", "박문수","임꺽정"};
        int[] ages ={55,23,47};
        double[] weights ={71.4, 67.9, 58.6};

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("./serial.ser"));

            oos.writeObject(names);
            oos.writeObject(ages);
            oos.writeObject(weights);
            System.out.println("저장 완료");
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {

            }
        }
    }
}
