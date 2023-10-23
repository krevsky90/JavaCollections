package map;

import map.SimpleLRUCache;

/**
 * Created by grinia on 30.05.2014.
 */
public class TestSimpleLRUCache {
    public static void main(String[] args) {
        SimpleLRUCache cache = new SimpleLRUCache(2);

        cache.put(1, "1");
        cache.put(2, "2");
        cache.put(3, "3");
        //after this we remove the oldest element - 1
        cache.get(2);   //change the order, now: 3 2
        cache.put(9, "9");  //remove element with minimal index - 3

        System.out.println(cache);  //the result is: 2 9
    }
}
