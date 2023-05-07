package day31mapsexceptions;

import java.util.Hashtable;

public class HashTableRPT {
    /*
    1. HashTable is thread-safe and synchronized but HashMap is not thread-safe and synchronized
    2. HashTable puts the elements in random order.
    3. To be thread-safe and synchronized needs time, that is why HashTable is slower than HashMap
    4. HashTable does not accept null in "Key"s and in "value"s
     */
    public static void main (String[] args) {

        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("Alican" , 13);
        ht.put("TomHanks" , 65);
        ht.put("BradPitt" , 56);
        // ht.put(null , 56); ==> HashTable does not accept null in "key"s
        // ht.put("MarkTawin" , null); ==> HashTable does not accept null in "value"s
        System.out.println(ht); // {BradPitt=56, TomHanks=65, Alican=13}

        System.out.println(ht.get("Angelina Jolie"));
        System.out.println(ht.getOrDefault("Angelina Jolie", -1)); // -1

        //System.out.println(ht.get("Alican") + ht.get("TomHanks") + ht.get("BradPitt") + ht.get("Angelina Jolie"));
        System.out.println(ht.getOrDefault("Alican", 0) + ht.getOrDefault("TomHanks", 0) + ht.getOrDefault("BradPitt", 0) + ht.getOrDefault("Angelina Jolie", 0));


    }
}
