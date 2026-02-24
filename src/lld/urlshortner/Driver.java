package lld.urlshortner;

import lld.urlshortner.db.Cache;
import lld.urlshortner.db.Database;
import lld.urlshortner.hash.Encoder;
import lld.urlshortner.url.UrlGenerator;
import lld.urlshortner.url.UrlService;
import lld.urlshortner.util.*;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Main Class");
        UrlService urlService = new UrlService(Cache.getInstance(), Database.getInstance(), new UrlGenerator(new Encoder()));
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println();
            System.out.println("Please Enter the long Url: ");
            String urlToShort = scanner.next();
            if(!Utility.validateUrl(urlToShort)) throw new RuntimeException("Invalid Url");
            String shortUrl = urlService.createShortUrl(urlToShort);
            System.out.println("shortUrl: " + shortUrl);
            String longUrl = urlService.getLongUrl(shortUrl);
            System.out.println("longUrl: " + longUrl);
        }


    }
}
