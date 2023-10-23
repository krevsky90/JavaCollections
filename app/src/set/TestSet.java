package set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by grinia on 28.05.2014.
 */
public class TestSet {
    public static void main(String[] args) {
        Set<Integer> mySet = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        mySet.add(1);
        mySet.add(2);
        mySet.add(1);
        System.out.println(mySet);
        //
    }
}
