package lld.cache.model;

public interface Cache<K,V> {
    V get(K key);
    void put(K key, V value);
    void evict(K key);
    void clear();
    void print();
}
