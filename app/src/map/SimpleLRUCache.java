package map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by grinia on 30.05.2014.
 */
public class SimpleLRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public SimpleLRUCache(int capacity) {
        //1.1f - loadFactory ( > 1), true - accessOrder
        //initialCapacity + 1 - because firstly the new element is added to collection and AFTER this method removeEldestEntry will be called and AFTER that some element will be removed
        super(capacity + 1, 1.1f, true);
        this.capacity = capacity;
    }

    /**
     * If this method returns <br>true/br> than the less popular (by frequency of access) elements will be removed from collection when method put() is called
     * @param eldest
     * @return
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return this.size() > capacity;
    }
}
