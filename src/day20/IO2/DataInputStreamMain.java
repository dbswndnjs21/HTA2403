package day20.IO2;

import java.io.*;

public class DataInputStreamMain {
    public static void main(String[] args) {
        DataInputStream dis = null;

        try {
            dis = new DataInputStream(new FileInputStream("./data.dat"));

            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readFloat());
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                dis.close();
            } catch (IOException e) {
            }
        }
    }
}
