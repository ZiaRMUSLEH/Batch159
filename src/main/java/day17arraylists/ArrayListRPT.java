package day17arraylists;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayListRPT {
    public static void main(String[] args) {

        //Example 1: Type code to check if the elements in a String ArrayList are in alphabetical order or not
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Albany");
        cities.add("Jacksonville");
        cities.add("Miami");
        cities.add("Tampa");
        System.out.println(cities);

        ArrayList<String> newCities = new ArrayList<>();
        newCities.addAll(cities);
        Collections.sort(newCities);
        if (cities.equals(newCities)){
            System.out.println("Elements in Array are in alphabetic order ");
        } else {System.out.println("Elements in Array are not in alphabetic order ");}


        //Example 2: Type code to find the closest values in an Integer List
        //           [12, 31, 15, 32, 54] ==> 31 and 32
        ArrayList<Integer> ex1 = new ArrayList<>();
        ex1.add(12);
        ex1.add(31);
        ex1.add(15);
        ex1.add(32);
        ex1.add(54);
        Collections.sort(ex1);
        int minDif = ex1.get(1)-ex1.get(0);

        for (int i=1; i<ex1.size(); i++){
            minDif = Math.min(minDif, ex1.get(i) - ex1.get(i-1));
        }
        for (int i=1; i<ex1.size(); i++){
            if (minDif==ex1.get(i) - ex1.get(i-1)){
                System.out.println(ex1.get(i-1) + " and " +ex1.get(i)+" are closest values "  );
            }
        }


        //Example 3: Type code to find the sum of the elements if they are different from 31 and 54
        //           [12, 31, 15, 32, 54] ==> 12 + 15 + 32 = 59
        ArrayList<Integer> ex3 = new ArrayList<>();
        int sum = 0;
        ex3.add(12);
        ex3.add(31);
        ex3.add(15);
        ex3.add(32);
        ex3.add(54);

        for (Integer w :ex3) {
            if(w!=31 && w!=54){
                sum = sum+w;
            }

        }
        System.out.println("sum = " + sum);


        //Example 4: Type code to check if all elements are unique or not in a List
        //           [12, 31, 15, 32, 54] ==> Unique       [12, 31, 12, 32, 54] ==> Not Unique
        ArrayList<Integer> ex4 = new ArrayList<>();
        ex4.add(12);
        ex4.add(31);
        ex4.add(12);
        ex4.add(32);
        ex4.add(54);
        int counter = 0;
        for (Integer w:ex4){
            if (ex4.indexOf(w)!=ex4.lastIndexOf(w)){
                System.out.println("all elements are not unique "); break;
            } else {counter++;}
        } if (counter==ex4.size()){System.out.println("all elements are unique ");}

    }
}
