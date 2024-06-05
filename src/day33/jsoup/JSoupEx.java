package day33.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JSoupEx {
    public static void main(String[] args) {
        String strHtML = "<html>" +
                "<head>" +
                "<title> Hello JSoup</title>" +
                "</head>" +
                "<p>hello jsoup doc1" +
                "<p>hello jsoup doc1" +
                "</body>" +
                "</html>";

        // DOM
        Document doc = Jsoup.parse(strHtML);
        System.out.println(doc);

        // 문서에 대한 정보
        System.out.println(doc.head());
        System.out.println(doc.body());

        System.out.println(doc.title());
        System.out.println(doc.charset());

        // html
        // getElementById / getElementsByTag
        Elements titles = doc.getElementsByTag("title");
        System.out.println(titles);
        System.out.println(titles.text());

        Elements pTags = doc.getElementsByTag("p");
        System.out.println(pTags);
        System.out.println(pTags.size());

        for (int i = 0; i < pTags.size(); i++) {
            Element pTag = pTags.get(i);

            System.out.println(pTag);
            System.out.println(pTag.tagName());
            System.out.println(pTag.text());
        }

    }
}
