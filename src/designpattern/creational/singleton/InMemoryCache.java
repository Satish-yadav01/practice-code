package designpattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class InMemoryCache {
    private Map<String , String> cache = new HashMap<>();
    private static InMemoryCache inMemoryCache;
    private InMemoryCache() {}

    public static synchronized InMemoryCache getInstance(){
        if (inMemoryCache == null) {
            inMemoryCache =  new InMemoryCache();
        }
        return inMemoryCache;
    }

    public void put(String key, String value) {
        cache.putIfAbsent(key, value);
    }

    public String get(String key) {
        return cache.get(key);
    }

    public Map<String , String> getAll() {
        return cache;
    }
}
