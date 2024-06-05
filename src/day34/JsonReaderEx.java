package day34;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonReaderEx
{
    public static StringBuilder readFile(String fileName) {
        BufferedReader br = null;
        StringBuilder sbResult = new StringBuilder();

        try {
            br = new BufferedReader(new FileReader(fileName));

            String line = null;
            while((line = br.readLine()) != null) {
                sbResult.append(line + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("[에러]" + e.getMessage());
        } catch (IOException e) {
            System.out.println("[에러]" + e.getMessage());
        }finally {
            if(br != null) try {br.close();} catch (Exception e) {}
        }
        return sbResult;
    }

    public static void main(String[] args) {
        StringBuilder sbResult = readFile("C:\\Users\\jhta\\IdeaProjects\\CodingTest\\src\\day34\\data.json");
//        System.out.println(sbResult.toString());

        JSONParser parser = new JSONParser();

        try {
            JSONArray arr = (JSONArray) parser.parse(sbResult.toString());
            for (int i = 0; i < arr.size(); i++) {
                JSONObject obj = (JSONObject) arr.get(i);

                String result = String.format("%S / %S / %S / %s ", (String) obj.get("name"),(String) obj.get("publisher"),
                        (String) obj.get("author"),(String) obj.get("price") ) ;
                System.out.println(result);

            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}