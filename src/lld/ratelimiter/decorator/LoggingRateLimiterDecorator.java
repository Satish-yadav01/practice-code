package lld.ratelimiter.decorator;

import lld.ratelimiter.strategy.RateLimiterStrategy;

public class LoggingRateLimiterDecorator implements RateLimiterStrategy {

    private final RateLimiterStrategy wrapped;

    public LoggingRateLimiterDecorator(RateLimiterStrategy wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public boolean allowRequest(String request) {
        boolean result = wrapped.allowRequest(request);
        System.out.println("Ip: " + request + " -> " + (result ? "ALLOWED" : "BLOCKED"));

        return result;
    }
}
