package day34;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONEx04 {
    public static void main(String[] args) {
        String strJson = "[{\"name\": \"홍길동\", \"city\": \"서울\"}, {\"name\": \"박문수\", \"city\": \"대전\"}]";

        JSONParser parser = new JSONParser();

        try {
            JSONArray arr = (JSONArray) parser.parse(strJson);
            System.out.println(arr.toString());

            for (int i = 0; i < arr.size(); i++) {
                JSONObject obj = (JSONObject) arr.get(i);
//                System.out.println(obj);
                System.out.println((String)obj.get("name"));
            }
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }
}
