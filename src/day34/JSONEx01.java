package day34;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONEx01 {
    public static void main(String[] args) {
//        String strJson = "[ 1, 2, 3, 4 ]";
        String strJson = "[ \"1\",\"2\",\"3\",\"4\"]";
        JSONParser parser = new JSONParser();
        // validation 검사를 반드시 해야됨

        try {
            JSONArray arr =  (JSONArray) parser.parse(strJson);
            System.out.println(arr);

            for (int i = 0; i < arr.size(); i++) {
                // 정수 -> Long
//                long data = (Long) arr.get(i);
                String data = (String) arr.get(i);
                System.out.println(data);
            }
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }
}
