package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda01RPT {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Mary");
        names.add("Michale");
        names.add("Alex");
        names.add("Alberto");
        names.add("Chris");

        System.out.println(getSquaresOfLengthsInListDistinctly1(names));

       // printIntegers1(3, 11);
        System.out.println();
        printIntegers2(3, 11);
        System.out.println();
        System.out.println(getFactorial(5));
        System.out.println();
        System.out.println(findTheSumOfIntegersBetweenTwoGivenIntegers(7, 4));
        System.out.println();
       // System.out.println(getTheSumOfDigitsOfIntegersInTheGivenRange1(45, 47));
       System.out.println(getTheSumOfDigitsOfIntegersInTheGivenRange2(45, 47)); //454647

    }
    //Example 1: Create a method takes the square of lengths of Strings, puts them in a list in reverse order distinctly
    public static List<Integer> getSquaresOfLengthsInListDistinctly1 (List<String> strList){
        return strList.
                stream().
                map(String::length).
                distinct().
                map(UtilsRPT::getSquare).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
    }



    /*
        Note: Normally for distinct elements we should use "Set" to store the elements.
              But "collect(Collectors.toSet())" method does not let you sort the elements, but we need to sort the elements in reverse order
              That is why we did not use "collect(Collectors.toSet())" we used "collect(Collectors.toList());" with "distinct()"
    */

    //Example 2: Create a method prints the integers from 3 to 11

    public static void printIntegers2 (int start, int end){
        IntStream.rangeClosed(start,end).forEach(UtilsRPT::printWithSpace);
    }

    //Example 3: Create a method to calculate the factorial of a given number
    //           5! ==> 1*2*3*4*5 = 120        3! ==> 1*2*3 = 6     0! = 1   No factorial for negative integers
    public static int getFactorial(int a) {

        return IntStream.rangeClosed(1,a).reduce(Math::multiplyExact).getAsInt();

    }

    //Example 4: Create a method to find the sum of integers from 4 to 7
    public static int findTheSumOfIntegersBetweenTwoGivenIntegers (int start, int end){
        if(start>end){
            start=start+end;
            end= start-end;
            start = start-end;
        }
        return IntStream.rangeClosed(start,end).reduce(Math::addExact).getAsInt();
    }


    //Example 5: Create a method to find the sum of the digits of integers from 45 to 47
    //           4+5+4+6+4+7=30
    public static int getTheSumOfDigitsOfIntegersInTheGivenRange2 (int start, int end){
     return
             //IntStream.rangeClosed(start,end).map(UtilsRPT::getSumDigits).reduce(Math::addExact).getAsInt();
             IntStream.rangeClosed(start,end).map(UtilsRPT::getSumDigits).sum();
    }

}