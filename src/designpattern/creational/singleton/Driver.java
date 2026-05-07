package designpattern.creational.singleton;

public class Driver {
    public static void main(String[] args) {
//        InMemoryCache memoryCache = InMemoryCache.getInstance();
//        memoryCache.put("satish","1");
//        memoryCache.put("Abhishek","2");
//        memoryCache.put("jayesh","3");
//        memoryCache.put("chandu","4");
//
//        System.out.println(memoryCache.get("jayesh"));
//
//        InMemoryCache memoryCache1 = InMemoryCache.getInstance();
//        System.out.println(memoryCache1.get("jayesh"));
//
//        InMemoryCache memoryCache2 = InMemoryCache.getInstance();
//        System.out.println(memoryCache2.get("jayesh"));

        //test the singleton with multiple threads
//        for (int i = 0; i < 10; i++) {
//            Thread thread = new Thread(() -> {
//                InMemoryCache cache = InMemoryCache.getInstance();
//                cache.print();
//            }, "Thread-" + i);
//            thread.start();
//        }

        //test the concurrency of cache whether that will update properly or not.
        // need a sequential update 10 - 20 - 30 - 40 - 50
        System.out.println("Map Testing");
        InMemoryCache instance = InMemoryCache.getInstance();
            for (int i = 0; i < 5; i++) {
                int finalI = i;
                Thread thread = new Thread(() -> instance.put("A", finalI *10),"Thread-"+i);
                thread.start();
            }


        instance.print();


    }
}
