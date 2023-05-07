package day31mapsexceptions;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapRPT {
    /*
    1. TreeMap puts the entries in natural order by using keys
    2. TreeMap is the slowest Map, if you need entries to be in natural order;
    3. TreeMap are not tread-safe and are not synchronized
    4. TreeMap does not accept null in keys but accept null in values
     */

    public static void main (String[] args) {

       long t1 = System.nanoTime();

        TreeMap<String , Integer> tm = new TreeMap<>();
        tm.put("Ali Can", 13);
        tm.put("Tom Hanks", 65);
        tm.put("Brad Pitt", 56);
        tm.put("Ajda Pekkan", 76);
        tm.put("Cuneyt Arkin", 78);

        long t2 = System.nanoTime();

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Ali Can", 13);
        hm.put("Tom Hanks", 65);
        hm.put("Brad Pitt", 56);
        hm.put("Ajda Pekkan", 76);
        hm.put("Cuneyt Arkin", 78);

        long t3 = System.nanoTime();


        HashMap<String, Integer> hmm = new HashMap<>();
        hmm.put("Ali Can", 13);
        hmm.put("Tom Hanks", 65);
        hmm.put("Brad Pitt", 56);
        hmm.put("Ajda Pekkan", 76);
        hmm.put("Cuneyt Arkin", 78);

        TreeMap<String, Integer> tmm = new TreeMap<>(hmm);
        //System.out.println(tmm);
        long t4 = System.nanoTime();

        System.out.println("Making TreeMap: " +(t2-t1));
        System.out.println("Making HashMap: " +(t3-t2));
        System.out.println("Making HashMap in TreeMap structure: " +(t4-t3));
    }
}
