package lld.cache.eviction;

public class MRUEvictionPolicy implements EvictionPolicy{
    @Override
    public void evict(Object key) {
        System.out.println("MRUEvictionPolicy.evict");
    }
}
