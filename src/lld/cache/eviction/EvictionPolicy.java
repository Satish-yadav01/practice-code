package lld.cache.eviction;

public interface EvictionPolicy<K> {
    void evict(K key);
}
