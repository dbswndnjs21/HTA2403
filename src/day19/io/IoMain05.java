package day19.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoMain05 {
    public static void main(String[] args) {

        BufferedOutputStream bos = null;

        try {
            bos = new BufferedOutputStream(new FileOutputStream("./text2.txt"));

            bos.write('a');
            bos.write('b');
            bos.write('\n');
            bos.write('a');
            bos.write('b');
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } finally {
            try {
                bos.close();
            } catch (IOException e) {
            }
        }
    }
}
