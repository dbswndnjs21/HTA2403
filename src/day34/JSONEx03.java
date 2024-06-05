package day34;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONEx03 {
    public static void main(String[] args) {
        String strJson = "{ \"key1\":[1,2,3,4,5] , \"key2\": [6, 7, 8, 9 10] }";

        JSONParser parser = new JSONParser();

        try {
            JSONObject obj = (JSONObject) parser.parse(strJson);
            System.out.println(obj.toString());

            JSONArray arr1 = (JSONArray) obj.get("key1");
            System.out.println(arr1);

            for (int i = 0; i < arr1.size(); i++) {
                long data = (Long) arr1.get(i);
                System.out.println(data);
            }

        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }
}
