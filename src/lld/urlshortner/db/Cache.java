package lld.urlshortner.db;

import java.util.concurrent.ConcurrentHashMap;

public class Cache {
    private ConcurrentHashMap<String,String> cache = new ConcurrentHashMap<>();
    private static final Cache instance = null;
    private Cache(){}

    public void put(String shortUrl, String longUrl) {
        cache.put(shortUrl, longUrl);
    }

    public String get(String key) {
        return cache.get(key);
    }

    public static Cache getInstance(){
        synchronized(Cache.class) {
            return new Cache();
        }

    }
}
