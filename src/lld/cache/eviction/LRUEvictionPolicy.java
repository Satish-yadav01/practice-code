package lld.cache.eviction;

public class LRUEvictionPolicy implements EvictionPolicy{
    @Override
    public void evict(Object key) {
        System.out.println("LRUEvictionPolicy.evict");
    }
}
