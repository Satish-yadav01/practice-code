package designpattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryCache {
    private final Map<String,Integer> cache = new ConcurrentHashMap<>();
    private static InMemoryCache inMemoryCache;
    private InMemoryCache() {
        System.out.println("Instance created by: " + Thread.currentThread().getName());
    }

    public static InMemoryCache getInstance(){
        if (inMemoryCache == null) {
            synchronized (InMemoryCache.class){
                if(inMemoryCache == null){
                    inMemoryCache =  new InMemoryCache();
                }
            }
        }
        return inMemoryCache;
    }

    public void put(String key, int value) {
        if(cache.containsKey(key))  System.out.println("key : " + key + ",value : " + value);
        cache.put(key, value);
    }

    public int get(String key) {
        return cache.get(key);
    }

    public Map<String , Integer> getAll() {
        return cache;
    }

    public void print(){
        System.out.println("printing by: " + Thread.currentThread().getName() + ", cache data : " + cache);
    }

}
