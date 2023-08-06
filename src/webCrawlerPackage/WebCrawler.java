package webCrawlerPackage;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;

public class WebCrawler implements Runnable {
    private final int id;
    private final ArrayList<String> visitedLinks = new ArrayList<>();
    private final String firstLink;
    private final Thread thread;
    private static final int webDepth = 3;

    @Override
    public void run() {
        crawl(1, firstLink);
    }

    public WebCrawler(String link, int num) {
        System.out.println("Павук успешно создан! :)");
        thread = new Thread(this);
        thread.start();

        id = num;
        firstLink = link;
    }

    public void crawl(int level, String url) {
        if (level <= webDepth) {
            Document doc = request(url);

            if (doc != null) {
                for (Element link : doc.select("a[href]")) {
                    String next_link = link.absUrl("href");
                    if (visitedLinks.contains(next_link) == false) {
                        crawl(level++, next_link);
                    }
                }
            }
        }
    }

    private Document request(String url) {
        try {
            Connection con = Jsoup.connect(url);
            Document doc = con.get();

            if (con.response().statusCode() == 200) {
                System.out.println("\n**Айдишник бота: " + id + " Получена веб-страница по запросу  \n" + url);

                String title = doc.title();
                System.out.println(title);
                visitedLinks.add(url);

                return doc;
            }
            return null;
        } catch (IOException e) {
            return null;
        }
    }

    public Thread getThread() {
        return thread;
    }
}
