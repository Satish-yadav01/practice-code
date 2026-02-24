package lld.ratelimiter;

import lld.ratelimiter.decorator.LoggingRateLimiterDecorator;
import lld.ratelimiter.service.RateLimiterService;
import lld.ratelimiter.strategy.FixedWindowStrategy;
import lld.ratelimiter.strategy.RateLimiterStrategy;

import java.util.Scanner;

public class RateLimiterDriver {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("RateLimiterDriver");
        int maxRequestPerWindow = 5;
        long windowSize = 200000L;
        String algorithm = "fixed";

        RateLimiterService limiterService = new RateLimiterService(algorithm,maxRequestPerWindow, windowSize);
        System.out.println("Here, In " + (windowSize/1000) + " seconds " + maxRequestPerWindow + " request is Only allowed" );
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter IP address (or 'exit'): ");
            String ip = scanner.next();
            if ("exit".equalsIgnoreCase(ip)) break;
            limiterService.handleRequest(ip);
        }


        // Decorating with logging
        RateLimiterStrategy decorated = new LoggingRateLimiterDecorator(new FixedWindowStrategy(10,10000L));

        for (int i = 0; i < 10; i++) {
            boolean allowed = decorated.allowRequest("192.168.0.1");
            Thread.sleep(500); // Simulate delay
        }

    }
}
