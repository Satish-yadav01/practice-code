package lld.cache.eviction;

public class LFUEvictionPolicy implements EvictionPolicy{
    @Override
    public void evict(Object key) {
        System.out.println("LFUEvictionPolicy.evict");
    }
}
