package lld.ratelimiter.service;

import lld.ratelimiter.factory.RateLimiterFactory;
import lld.ratelimiter.strategy.FixedWindowStrategy;
import lld.ratelimiter.strategy.RateLimiterStrategy;

public class RateLimiterService {

    private final FixedWindowStrategy fixedWindowStrategy;

    public RateLimiterService(String algorithm,int maxRequestsPerWindow, long windowSizeMill) {
        FixedWindowStrategy fixedWindowStrategy1;
        RateLimiterStrategy limiterStrategy = RateLimiterFactory.getRateLimiterStrategy(algorithm);
        if(limiterStrategy instanceof FixedWindowStrategy) {
            fixedWindowStrategy1 = new FixedWindowStrategy(maxRequestsPerWindow, windowSizeMill);
        }
        fixedWindowStrategy1 = new FixedWindowStrategy(maxRequestsPerWindow, windowSizeMill);
        this.fixedWindowStrategy = fixedWindowStrategy1;
    }

    public void handleRequest(String ip) {
        if(fixedWindowStrategy.allowRequest(ip)){
            System.out.println(ip + " Allowed");
            System.out.println("go with the business logic");
        }else{
            System.out.println(ip + " Not Allowed");
        }
    }
}
