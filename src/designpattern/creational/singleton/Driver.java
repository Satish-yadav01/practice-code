package designpattern.creational.singleton;

public class Driver {
    public static void main(String[] args) {
        InMemoryCache memoryCache = InMemoryCache.getInstance();
        memoryCache.put("satish","1");
        memoryCache.put("Abhishek","2");
        memoryCache.put("jayesh","3");
        memoryCache.put("chandu","4");

        System.out.println(memoryCache.get("jayesh"));

        InMemoryCache memoryCache1 = InMemoryCache.getInstance();
        System.out.println(memoryCache1.get("jayesh"));

        InMemoryCache memoryCache2 = InMemoryCache.getInstance();
        System.out.println(memoryCache2.get("jayesh"));
    }
}
