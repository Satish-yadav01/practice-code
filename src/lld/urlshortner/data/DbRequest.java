package lld.urlshortner.data;

import java.time.LocalDate;

public class DbRequest {
    private static final int DEFAULT_EXPIRY = 1;
    private final long id;
    private final String longUrl;
    private final String shortUrl;
    private final LocalDate createAt;
    private final LocalDate expiry;

    public DbRequest(long id, String longUrl, String shortUrl) {
        this.id = id;
        this.longUrl = longUrl;
        this.shortUrl = shortUrl;
        this.createAt = LocalDate.now();
        LocalDate currentDate = LocalDate.now();
        this.expiry = currentDate.plusYears(DEFAULT_EXPIRY);;
    }

    public DbRequest(long id, String longUrl, String shortUrl, LocalDate expiry) {
        this.id = id;
        this.longUrl = longUrl;
        this.shortUrl = shortUrl;
        this.createAt = LocalDate.now();
        LocalDate currentDate = LocalDate.now();
        this.expiry = expiry;
    }

    public long getId() {
        return id;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public LocalDate getCreateAt() {
        return createAt;
    }

    public LocalDate getExpiry() {
        return expiry;
    }
}
