package Models.Concurrency.WebScrapper;

import java.util.concurrent.Callable;

public class ScrapUrl implements Callable<Void> {
    private String url;

    public ScrapUrl(String url) {
        this.url = url;
    }

    @Override
    public Void call() throws Exception {
        System.out.println("Scraping Website: " +  this.url);
        Thread.sleep(500);
        return null;
    }
}
