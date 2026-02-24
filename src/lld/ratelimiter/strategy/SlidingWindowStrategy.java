package lld.ratelimiter.strategy;

public class SlidingWindowStrategy implements RateLimiterStrategy{
    @Override
    public boolean allowRequest(String request) {
        return false;
    }
}
