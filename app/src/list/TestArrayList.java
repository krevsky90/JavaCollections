package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by grinia on 31.05.2014.
 */
public class TestArrayList {
    public static void main(String[] args) {
//        int[] arr = new int[3];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//
//        int newSize = 5;
//        int[] newArr = Arrays.copyOf(arr, newSize);
//
//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        int initCapacity = 3;
        List<Integer> intList = new ArrayList<Integer>(initCapacity);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println("");
        intList.add(null);  //ok
        System.out.println("");
    }

}
