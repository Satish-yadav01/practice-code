package lld.cache.model;

import lld.cache.eviction.EvictionPolicy;
import java.util.LinkedHashMap;
import java.util.Map;

public class InMemoryCache<K,V> implements Cache<K,V>{

    private Map<K,V> map = new LinkedHashMap<K,V>();
    private EvictionPolicy<K> evictionPolicy;


    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public void put(K key, V value) {

    }

    @Override
    public void evict(K key) {

    }

    @Override
    public void clear() {

    }

    @Override
    public void print() {

    }
}
