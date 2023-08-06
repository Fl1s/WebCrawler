package webCrawlerPackage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WebCrawler> bots = new ArrayList<>();
        for (WebCrawler w : bots){
            try {
                w.getThread().join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        //bots.add(new WebCrawler("Ссылка", Номер));

    }
}