package set;

import java.util.*;

/**
 * Created by grinia on 28.05.2014.
 */
public class TestSortedSet {
    public static void main(String[] args) {
        SortedSet<Integer> mySet = new TreeSet<Integer>();
        for(int i = 0; i < 10; i++) {
            mySet.add(i);
        }

        System.out.println(mySet);
        System.out.println(getNextItem(4, (TreeSet) mySet));

    }

    public static Integer getNextItem(Integer elem, TreeSet<Integer> set) {
        return set.higher(elem);
    }

    public static Set<Integer> getPrevItems(Integer elem, TreeSet<Integer> set) {
        return set.headSet(elem);
    }
}
