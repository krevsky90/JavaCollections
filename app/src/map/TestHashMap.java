package map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by grinia on 30.05.2014.
 */
public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
//        HashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(5, "a");
        map.put(4, "b");
        map.put(3, "c");
        map.put(2, "d");
        map.put(1, "e");
        map.put(null, null);

        System.out.println(map);
    }
}
