package day34lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01RPT {

    /*
        1)We learned "Structural Programming" so far, we will learn now "Functional Programming".
        2)"Functional Programming" uses Java Methods mostly to type codes.
     */

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(151);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(11);

        printEvenElements1(nums);
        System.out.println();
        printEvenElements2(nums);
        System.out.println();
        printDistinctOddElements(nums);
        System.out.println();
        System.out.println(sumOfCubeOfDifferentEvenElements(nums));
        System.out.println();
        System.out.println(maxElement(nums));
        System.out.println();
        System.out.println(maxElement1(nums));
        System.out.println();
        System.out.println(minElement(nums));
        System.out.println();
        System.out.println(minElement1(nums));
        System.out.println();
        System.out.println(multiplicationOfTheElementsLessThanSpecificNum(nums, 15));
        System.out.println();
        System.out.println(isLessThanSpec(nums, 140));
        System.out.println();
        System.out.println(isNoElementNegetive(nums));
        System.out.println();
        System.out.println(isAnyElementHave3Digit(nums));
    }

    //Example 1: Create a method to print even elements in an integer list

    //1.Way: Use "Structural Programming"
    public static void printEvenElements1(List<Integer> myList){
        for(Integer w:myList){
            if(w%2==0){
                System.out.print(w+" ");
            }
        }
    }


    //2.Way: Use  "Functional Programming"
    public static void printEvenElements2(List<Integer> myList){
        myList.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }


    //Example 2: Create a method to print square of distinct odd elements
    public static void printDistinctOddElements(List<Integer> myList){
        myList.stream().distinct().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));
    }


    //Example 3: Create a method to find the sum of the cube of the different even elements in a list
    public static int sumOfCubeOfDifferentEvenElements(List<Integer> myList){
        return
                myList.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(0, (t,u)->t+u);
    }

    //Example 4: Create a method to find the element whose value is the maximum
    //1.Way:
    public static int maxElement(List<Integer> myList){
       return myList.stream().distinct().sorted().reduce((t,u)->u).get();

    }


    //2.way:
    public static int maxElement1(List<Integer> myList){
        return myList.stream().distinct().reduce(myList.get(0),(t,u)->t>u?t:u);
    }


    //Example 5: Create a method to find the element whose value is the minimum
    //1.Way:
    public static int minElement(List<Integer> myList){
        return myList.stream().distinct().sorted().findFirst().get();

    }

    //2.way:
    public static int minElement1(List<Integer> myList){
        return myList.stream().distinct().reduce(myList.get(0),(t,u)->t<u?t:u);
    }



    //Example 6: Create a method to find the multiplication of the elements less than 15 and even
    public static int multiplicationOfTheElementsLessThanSpecificNum(List<Integer> myList , int spcf){
      return   myList.stream().filter(t->t<spcf).reduce(1,(t,u)->t*u);

    }


    //Example 7: Create a method to check if all elements are less than 140 or not.
    public static boolean isLessThanSpec(List<Integer> myList , int spcf){
        return myList.stream().allMatch(t->t<spcf);
    }


    //Example 8: Create a method to check if no element is negative or not.
    public static boolean isNoElementNegetive(List<Integer> myList){
       return myList.stream().noneMatch(t->t<0);

    }

    //Example 9: Create a method to check if any element has 3 digits
    public static boolean isAnyElementHave3Digit(List<Integer> myList){
        return myList.stream().anyMatch(t-> t>99 && t<1000);

    }

}