package day16arraylists;

import java.util.ArrayList;

public class ArrayListRPT {
    public static void main(String[] args) {

        /*
        1. ArrayLists are for storing multiple data in the same data type.
        2. Arrays are fixed in length but ArrayLists are flexible in size.
        3. If Arrays are not good why did not Java remove Arrays from Java structure?
            Because Arrays use memory so less, and Arrays are so fast.
            If you are sure about the length use Array instead if ArrayList
        4. Arrays can store just "primitive data" and "references of non-primitive data" but
            ArrayLists can store just "non-primitive data"
        5. Arrays are poor in methods but ArrayLists are so rich in methods
                 */

        //How to create an ArrayList
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println(nums);

        //How to add elements into an ArrayList
        //add() method adds the elements into the List in insertion order.
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println(nums);
        //add(index, element) puts the given element into the given index
        nums.add(2,5);
        nums.add(1, 6);
        System.out.println(nums);
        //addAll() method is for adding a list into another list
        ArrayList<Integer> nms = new ArrayList<>();
        nms.add(45);
        nms.add(25);
        nums.addAll(nms);
        System.out.println(nums);
        //addAll() method is for adding a list into another list at the given index
        nums.addAll(5,nms);
        System.out.println(nums);
        //How to check if a List is empty or not
        ArrayList<String> cities = new ArrayList<>();
        System.out.println(cities.isEmpty());
        cities.add("New york");
        cities.add("miami");
        System.out.println(cities.isEmpty());

        //Example 1: Create 2 Character ArrayList and check if the lists are equal to each other or not
        ArrayList<Character> a = new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');

        ArrayList<Character> b = new ArrayList<>();
        b.add('J');
        b.add('a');
        b.add('v');
        b.add('a');
            if (a.equals(b)){
                System.out.println("they are equal");
            } else {
                System.out.println("they are not equal");
            }

        //Example 2: Type code to print unique elements in an ArrayList
        for (Character w: b){
            if (b.indexOf(w)==b.lastIndexOf(w) ){
                System.out.print(w +" ");
            }
        }
    }
}
