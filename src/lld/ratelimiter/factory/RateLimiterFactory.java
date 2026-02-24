package lld.ratelimiter.factory;

import lld.ratelimiter.strategy.FixedWindowStrategy;
import lld.ratelimiter.strategy.RateLimiterStrategy;
import lld.ratelimiter.strategy.SlidingWindowStrategy;
import lld.ratelimiter.strategy.TokenBucketStrategy;

public class RateLimiterFactory {
    public static RateLimiterStrategy getRateLimiterStrategy(String algorithm) {
        return switch (algorithm.toLowerCase()) {
            case "fixed" -> new FixedWindowStrategy();
            case "token" -> new TokenBucketStrategy();
            case "sliding" -> new SlidingWindowStrategy();
            default -> throw new IllegalStateException("Unexpected value: " + algorithm.toLowerCase());
        };
    }
}
