package map;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by grinia on 30.05.2014.
 */
public class TestLinkedHashMap {
    public static void main(String[] args) {
        int initialCapacity = 5;
        float loadFactor = 1;
        boolean accessOrder = true;
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>(initialCapacity, loadFactor, accessOrder);
        map.put(5, "a");
        map.put(4, "b");
        map.put(3, "c");
        map.put(2, "d");
        map.put(1, "e");

        //change frequency of access to some elements
        map.get(3);
        map.get(5);
        map.get(1);

        System.out.println(map);

        //result {4=b, 2=d, 3=c, 5=a, 1=e}
        //the most popular elements placed at the end of collection if accessOrder = true
    }

    public static void testHashMap() throws NoSuchFieldException, IllegalAccessException {
        int initialCapacity = 2;
        float loadFactor = 2;
        boolean accessOrder = true;
        Map<Integer, String> map = new HashMap<Integer, String>(initialCapacity, loadFactor);
        Field f = map.getClass().getDeclaredField("table");
        f.setAccessible(true);
        for (int i =0; i< 100; i++) {
            map.put(i, "a"+i);
            Object[] table = (Object[]) f.get(map);
            System.out.println(i+";"+table.length+";"+table);
        }
        map.put(5, "a");
        map.put(4, "b");
        map.put(3, "c");
        map.put(2, "d");
        map.put(1, "e");


        Object[] table = (Object[]) f.get(map);
        System.out.println(table.length);


        System.out.println(map);

        //result {4=b, 2=d, 3=c, 5=a, 1=e}
        //the most popular elements placed at the end of collection if accessOrder = true
    }
}
