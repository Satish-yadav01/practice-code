package lld.ratelimiter.strategy;

public class TokenBucketStrategy implements RateLimiterStrategy{
    @Override
    public boolean allowRequest(String request) {
        return false;
    }
}
