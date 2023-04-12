package day18arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRPT {
    public static void main(String[] args) {
        //Example 1: Type code to find the number of different elements in an arraylist
        //           [2, 3, 1, 2, 1, 5, 3] ==> [2, 3, 1, 5] ==> 4
        ArrayList<Integer> ex1 = new ArrayList<>();
        ex1.add(2);
        ex1.add(3);
        ex1.add(1);
        ex1.add(2);
        ex1.add(1);
        ex1.add(5);
        ex1.add(3);
        ArrayList<Integer> difElements = new ArrayList<>();
        for (Integer w:ex1){
        if (!difElements.contains(w)){
            difElements.add(w);
        }}
        System.out.println(difElements.size());


        //Example 2: Type code to increase salaries in a list like if the salary is less than 10000
        //           increase it %20 otherwise increase it by adding 500
        ArrayList<Double> salaries = new ArrayList<>();
        salaries.add(9810.0);
        salaries.add(12450.0);
        salaries.add(15230.0);
        salaries.add(7500.0);
        salaries.add(10000.0);

        for (int i = 0; i<salaries.size(); i++) {
            if(salaries.get(i)<10000.0){
                salaries.set(i, salaries.get(i)+(salaries.get(i)*20/100));
            } else {salaries.set(i, salaries.get(i)+500);}}
        System.out.println(salaries);


        //More methods in ArrayLists
        ArrayList<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);
        n.add(5);
        System.out.println(n);

        ArrayList<Integer> p = new ArrayList<>();
        p.add(1);
        p.add(2);
        p.add(8);
        System.out.println(p);

        n.retainAll(p);
        System.out.println(n);





        //Example 1: Swap the given two integers
        //           int a = 12; and int b = 5; ==> a = 5 and b = 12
        int a = 12;
        int b = 5;

         a = a+b;
         b = a-b;
        System.out.println("b = " + b);
        a= a-b;
        System.out.println("a = " + a);


        //How to sort array elements in natural order
        char[] arr = {'b', 'e', 'a', 'd'};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //How to check if a specific element exists in an array or not
        char[] brr = {'b', 'e', 'a', 'd'};
        Arrays.sort(brr); //[a, b, d, e]
        int rslt = Arrays.binarySearch(brr, 'l');
        System.out.println("rslt = " + rslt);


    }
}
