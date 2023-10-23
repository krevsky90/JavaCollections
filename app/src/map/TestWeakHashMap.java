package map;

import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created by grinia on 31.05.2014.
 */
public class TestWeakHashMap {
    public static void main(String[] args) {
        Map<Date, String> map = new WeakHashMap();
        Date date = new Date(); //no matter the type of object
        map.put(date, "info");

        date = null;        //делаем доступным для GC
        System.gc();

        for (int i = 1; i < 10000; i++) {
            if (map.isEmpty()) {
                System.out.println("map is Empty!");
                System.out.println("i = " + i);
                break;
            } else {
                System.out.println("map is NOT empty");//этот вызов приведет к созданию нового объекта String каждый раз
                // -> создание большого числа стрингов приведет к вызову сборщика мусора
            }
        }
    }
}
