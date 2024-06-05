package day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UtilMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();

        if (str.length() == 1) {
            System.out.println("1개를 입력");
        } else {
            Util u = new Util(str);
            System.out.println(u.capitalizeName());

        }
    }
}
