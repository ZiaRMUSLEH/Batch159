package day30iteratorsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsRPT {
    /*
    1. maps are for storing multiple data
    2. maps use key-value structure to store multiple data
    3. keys are unique, values can be repeatedly
    4. every map element is called entry
    5. all map elements are called EntrySet
    6. all map elements are unique because key part is unique
    7. there are 3 map in java;
            i. HashMap:
                a. HashMap puts the elements in random order, HashMap is so fast
                b. HashMap accept null as a key just once
                c. HashMap accepts multiple null in the value part
            ii. HashTable
            iii. TreeMap
     */
    public static void main (String[] args) {

        HashMap<String, Integer> cp = new HashMap<>();
        cp.put("USA", 400);
        cp.put("Germany", 83);
        cp.put("Albania", 3);
        cp.put("Turkey", 85);
        cp.put("Germany", 87);
        System.out.println(cp);
        //Example 1: Find the average population of the given countries
        Collection<Integer> values = cp.values();
        double sum =0;
        for (Integer w: values){
            sum= sum+w;
        }
        double avg = sum/values.size();
        System.out.println("avg = " + avg);

        //Example 2: Print the country names contains "r"
       Set<String> keys= cp.keySet();
       for (String w: keys){
           if(w.contains("r")){
               System.out.println(w);
           }
       }

        //How to get value of a specific key
        int usaValue = cp.get("USA");
        System.out.println(usaValue);


        //How to check if keys have a specific key
       boolean keyPrsnt =  cp.containsKey("Germany");
        System.out.println(keyPrsnt);


        //How to check if values have a specific value
        boolean valuePrsnt = cp.containsValue(400);
        System.out.println(valuePrsnt);


        //Note: If you use same key with a different value in put(), it means you are updating the value
        //      cp.put("Germany", 83); then cp.put("Germany", 87); means you updated 83 to 87

        //How to update value of a key
        cp.replace("Germany", 99);
        System.out.println(cp);


        cp.putIfAbsent("UK", 4546);
        System.out.println(cp);

        //How to get all entries in a set

        Set<Map.Entry<String,Integer>> allEntries = cp.entrySet();
        for (Map.Entry<String,Integer> w: allEntries){
            System.out.println(w.getValue() + "...."+ w.getKey());
        }


    }
}
