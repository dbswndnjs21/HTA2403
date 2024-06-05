package day34;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class XMLReaderEx {

    public  static StringBuilder readFile(String fileName) {
        BufferedReader br = null;
        StringBuilder sbResult = new StringBuilder();

        try {
            br = new BufferedReader(new FileReader(fileName));

            String line = null;
            while ((line = br.readLine()) != null) {
                sbResult.append(line +  "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if( br != null ) try { br.close(); } catch( IOException e ) {}
        }
        return sbResult;
    }
    public static void main(String[] args) {
        StringBuilder sbResult = readFile("C:\\Users\\jhta\\IdeaProjects\\CodingTest\\src\\day34\\data.xml");
//        System.out.println(sbResult.toString());

        Document doc = Jsoup.parse(sbResult.toString());
        Elements books = doc.select("book");

        for (Element book : books) {
            String title = book.selectFirst("name").text();
            String publisher = book.selectFirst("publisher").text();
            String author = book.selectFirst("author").text();
            String price = book.selectFirst("price").text();

            System.out.printf("%s / %s / %s / %s%n", title, publisher, author, price);
        }

    }
}
