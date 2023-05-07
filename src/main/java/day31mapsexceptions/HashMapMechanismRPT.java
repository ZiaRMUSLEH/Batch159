package day31mapsexceptions;

import java.util.HashMap;

public class HashMapMechanismRPT {
    /*
    1. when you create a HashMap java gives you 16 "buckets"
    2. java puts indexes for every bucket from 0 to 15
    3. when you put an entry int the map;
               i. java create hashcode for the "key" of the entry
               ii. java divides the hashcode by 16 and gets the remainder as index than
               puts the entry to the bucket whose index was found after division.
    4. if multiple entries will be put into a single bucket, java uses "LinkedList" structure.
    5. if 75% of existing bucket is full then java gives you another 16 buckets.
    6. to find a specific value, java follows the steps like;
        Index--> HashCode--> Key--> Return the Value
     */
    public static void main (String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Albania" , 3);
        hm.put("Germany" , 83);
        hm.put("Belgium" , 12);

    }
}
