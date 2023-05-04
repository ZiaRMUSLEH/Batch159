package day29collection;
/*
sets are for storing unique data like email addresses, student ids etc.
there are 3 sets i. HashSet:
                    "Hash"ing is a technique to create unique codes for data
                    HashSet does not put the elements in any order. HashSet puts the elements in random order.
                    HashSet is so fast because it does not spend time to order the elements.
                    you can store just a single "null" in a hashSe
                 ii. LinkedHashSet:
                     LinkedHashSet puts the elements in "insertion order"
                     LinkedHashSet is slower than HashSet because it spends time in ordering elements
                 iii. TreeSet:
                     TreeSet puts the elements in "natural order"
                     Putting elements in natural order needs too much time that is why TreeSet is the slowest set.
                     TreeSet does not accept null as element
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsRPT {
    public static void main (String[] args) {

        HashSet<Integer> nums = new HashSet<>();
        nums.add(4);
        nums.add(9);
        nums.add(7);
        nums.add(6);
        nums.add(8);
        nums.add(1);
        System.out.println("nums = " + nums);

        LinkedHashSet<Integer> mhs = new LinkedHashSet<>();
        mhs.add(43);
        mhs.add(9);
        mhs.add(6);
        mhs.add(50);
        mhs.add(4);
        mhs.add(8);
        System.out.println("mhs = " + mhs);

        System.out.println("nums.retainAll(mhs) = " + nums.retainAll(mhs));
        System.out.println("nums = " + nums);

        long t1 = System.nanoTime();

        HashSet<String> hs = new HashSet<>();
        hs.add("Germany");
        hs.add("Albania");
        hs.add("Belgium");
        hs.add("USA");
        hs.add("UK");
        hs.add("Albania");
        hs.add("India");
        System.out.println("hs = " + hs);

        long t2 = System.nanoTime();
        System.out.println("t2 = " + t2);
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Germany");
        ts.add("Albania");
        ts.add("Belgium");
        ts.add("USA");
        ts.add("UK");
        ts.add("Albania");
        ts.add("India");
        System.out.println("ts = " + ts);

        long t3 = System.nanoTime();


        HashSet<Integer> nums1 = new HashSet<>();
        nums1.add(4);
        nums1.add(9);
        nums1.add(7);
        nums1.add(6);
        nums1.add(8);
        nums1.add(1);

        TreeSet<Integer> ts2 = new TreeSet<>(nums1);
        System.out.println("ts2 = " + ts2);

        long t4 = System.nanoTime();

        System.out.println(t2-t1);
        System.out.println(t3-t2);
        System.out.println(t4-t3);



    }
}
