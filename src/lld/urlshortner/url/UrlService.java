package lld.urlshortner.url;

import lld.urlshortner.data.DbRequest;
import lld.urlshortner.db.Cache;
import lld.urlshortner.db.Database;

import java.util.Objects;


public class UrlService {

    private final Cache cache;
    private final Database database;
    private final UrlGenerator urlGenerator;

    public UrlService(Cache cache, Database database, UrlGenerator urlGenerator) {
        this.cache = cache;
        this.database = database;
        this.urlGenerator = urlGenerator;
    }

    public String createShortUrl(String longUrl) {
        String shortUrl = urlGenerator.generateKey(longUrl);
        database.insert(longUrl, shortUrl);
        return shortUrl;
    }

    public String getLongUrl(String shortUrl) {
        if(shortUrl == null || shortUrl.isEmpty()) return "Please pass valid short url";
        if(Objects.isNull(cache.get(shortUrl))){
            DbRequest dbRequest = database.getRequest(shortUrl).orElseThrow();
            cache.put(shortUrl,dbRequest.getLongUrl());
            return dbRequest.getLongUrl();
        }
        return null;
    }
}
