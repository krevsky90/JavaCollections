package queue;

import java.util.*;

/**
 * Created by grinia on 31.05.2014.
 */
public class TestQueue {
    public static void main(String[] args) {
//        testPriorityQueue();
        testPriorityQueue2();
    }

    public static void testLinkedList() {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }

    public static void testPriorityQueue() {
        Queue<Integer> q = new PriorityQueue<Integer>();
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }

        //returns 1 2 3 4 5
        //because Integer implements Comparable -> queue uses Integer's comparator

        ArrayList list = new ArrayList<String>();
        list.add("f");
    }

    /**
     * возврашает сначала четные эл-ты по возрастанию, потом нечетные эл-ты во возрастанию
     */
    public static void testPriorityQueue2() {
        Queue<Integer> q = new PriorityQueue<Integer>(11, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 % 2 == 0 && o2 % 2 == 0) {
                    return o1 - o2;
                } else if (o1 % 2 != 0 && o2 % 2 != 0) {
                    return o1 - o2;
                } else if(o1 % 2 == 0 && o2 % 2 != 0) {
                    return -1;
                } else if (o1 % 2 != 0 && o2 % 2 == 0) {
                    return 1;
                }

                return 0;
            }
        });
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }

        //returns 1 2 3 4 5
        //because Integer implements Comparable -> queue uses Integer's comparator
    }
}
