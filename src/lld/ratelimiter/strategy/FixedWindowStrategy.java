package lld.ratelimiter.strategy;

import lld.ratelimiter.dto.IpRequestTracker;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FixedWindowStrategy implements RateLimiterStrategy {

    private final Map<String, IpRequestTracker> tracker = new ConcurrentHashMap<>();
    private final int maxRequests;
    private final long windowSizeMill;

    public FixedWindowStrategy() {
        this.maxRequests = 1;
        this.windowSizeMill = 1000L;
    }

    public FixedWindowStrategy(int maxRequests, long windowSizeMill) {
        this.maxRequests = maxRequests;
        this.windowSizeMill = windowSizeMill;
    }

    @Override
    public synchronized boolean allowRequest(String ip) {
        long now = System.currentTimeMillis();
        IpRequestTracker ipRequestTracker = tracker.get(ip);

        if (ipRequestTracker == null) {
            ipRequestTracker = new IpRequestTracker(now);
            ipRequestTracker.incrementRequestCount();
            tracker.put(ip,ipRequestTracker);
            return true;
        }

        if(now - ipRequestTracker.getWindowSize() > windowSizeMill) {
            ipRequestTracker.resetWindow(now);
            return true;
        }else{
            if(ipRequestTracker.getRequestCount() < maxRequests) {
                ipRequestTracker.incrementRequestCount();
                return true;
            }else{
                return false;
            }
        }
    }
}
