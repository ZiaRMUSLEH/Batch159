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
        nums.add(5);
        nums.add(6);
        nums.add(7);
        System.out.println(nums);

        //add(index, element) puts the given element into the given index
        nums.add(2, 45);
        System.out.println(nums);

        //addAll() method is for adding a list into another list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        nums.addAll(numbers);
        System.out.println(nums);

        //addAll() method is for adding a list into another list at the given index
        nums.addAll(1, numbers);
        System.out.println(nums);

        //How to check if a List is empty or not
        System.out.println(nums.isEmpty());

        //Example 1: Create 2 Character ArrayList and check if the lists are equal to each other or not
       ArrayList<Character> ch1 = new ArrayList<>();
       ch1.add('J');
       ch1.add('a');
       ch1.add('v');
       ch1.add('a');

        ArrayList<Character> ch2 = new ArrayList<>();
        ch2.add('J');
        ch2.add('a');
        ch2.add('v');
        ch2.add('a');

        if (ch1.equals(ch2)){
            System.out.println("they are equal");
        }else {
            System.out.println("they are not equal");
        }


        //Example 2: Type code to print unique elements in an ArrayList
        for (Character w:ch1){
            if (ch1.indexOf(w)==ch1.lastIndexOf(w)){
                System.out.print(w);
            }
        }

    }
}
