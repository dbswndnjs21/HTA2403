package day16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class localDateMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String time = now.format(formatter);

        System.out.println(time);
    }
}