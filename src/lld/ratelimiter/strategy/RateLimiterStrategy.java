package lld.ratelimiter.strategy;

public interface RateLimiterStrategy {
    boolean allowRequest(String request);
}
