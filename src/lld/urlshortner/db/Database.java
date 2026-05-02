package lld.urlshortner.db;

import lld.urlshortner.data.DbRequest;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class Database {

    private final ConcurrentHashMap<String, DbRequest> db = new ConcurrentHashMap<>();
    // Proper eager singleton instance
    private static final Database INSTANCE = new Database();

    // Use AtomicLong for thread-safe incrementing of ids
    private final AtomicLong counter = new AtomicLong(1);

    private Database() {}

    public static Database getInstance() {
        return INSTANCE;
    }

    public void insert(String longUrl, String shortUrl) {
        long id = counter.getAndIncrement();
        DbRequest req = new DbRequest(id, longUrl, shortUrl);
        db.put(shortUrl, req);
    }

    public Optional<DbRequest> getRequest(String shortUrl) {
        // Use ofNullable to handle missing entries without throwing NPE
        return Optional.ofNullable(db.get(shortUrl));
    }

}
