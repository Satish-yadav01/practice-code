package lld.ratelimiter.dto;

public class IpRequestTracker {
    private long windowStart;
    private int requestCount;

    public IpRequestTracker(long windowStart) {
        this.windowStart = windowStart;
        this.requestCount = 0;
    }

    public long getWindowSize() {
        return windowStart;
    }


    public int getRequestCount() {
        return requestCount;
    }

    public void incrementRequestCount() {
        this.requestCount++;
    }

    public void resetWindow(long newWindowStart) {
        this.windowStart = newWindowStart;
        this.requestCount = 1;
    }
}
