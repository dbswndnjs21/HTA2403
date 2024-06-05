package day34;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class movieReaderEx {

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
        StringBuilder sbResult = readFile("C:\\Users\\jhta\\IdeaProjects\\CodingTest\\src\\day34\\movie.xml");
//        System.out.println(sbResult.toString());

        Document doc = Jsoup.parse(sbResult.toString());
        // dailyBoxOffice 태그안에서 찾기
        Elements books = doc.select("dailyBoxOffice");

        for (Element book : books) {
            String rnum = book.selectFirst("rnum").text();
            String movieNm = book.selectFirst("movieNm").text();
            String openDt = book.selectFirst("openDt").text();
            String audiCnt = book.selectFirst("audiCnt").text();
            String audiAcc = book.selectFirst("audiAcc").text();

            //            System.out.printf("%s / %s / %s / %s%n", title, publisher, author, price);
            System.out.println();
        }

    }
}
