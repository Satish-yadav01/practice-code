package lld.urlshortner.db;

import lld.urlshortner.data.DbRequest;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class Database {

    private final ConcurrentHashMap<String, DbRequest> db = new ConcurrentHashMap<>();
    private final static Database instance = null;
    private static long counter=1;
    private Database() {}

    public static Database getInstance() {
        synchronized (Database.class) {
            return new Database();
        }

    }

    public void insert(String longUrl, String shortUrl) {
        DbRequest req = new DbRequest(counter,longUrl,shortUrl);
        db.put(shortUrl,req);
        counter++;
    }

    public Optional<DbRequest> getRequest(String shortUrl) {
        return Optional.of(db.get(shortUrl));
    }

}
