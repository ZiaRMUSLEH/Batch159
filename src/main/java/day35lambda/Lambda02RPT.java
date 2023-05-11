package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda02RPT {

    /*
        1)We learned "Structural Programming" so far, we will learn now "Functional Programming".
        2)"Functional Programming" uses Java Methods mostly to type codes.
     */



        public static void main(String[] args) {

            List<String> names = new ArrayList<>();
            names.add("Tom");
            names.add("Alex");
            names.add("Jim");
            names.add("Michael");
            names.add("Mary");
            names.add("Alexander");
            names.add("Alex");
            names.add("Brad");

            printLessThanFiveCharsUpperCase(names);
            System.out.println();
            printDistinctSortedByLengthLowerCase(names);
            System.out.println();
            printDistinctSortedByLengthThenAlphabeticalLowerCase(names);

        }
        //Example 1: Print the elements which have less than 5 characters in upper cases on the console
        public static void printLessThanFiveCharsUpperCase(List<String> names){
            names.
                    stream().
                    filter(t->t.length()<5).
                    map(String::toUpperCase).
                    forEach(t-> System.out.print(t + " "));
        }

        //Example 2: Print the elements on the console by ordering them according to their lengths in lower cases and un-repeatedly
        public static void printDistinctSortedByLengthLowerCase(List<String> names){
            names.stream().distinct().map(String::toLowerCase).sorted(Comparator.comparing(String::length)).forEach(UtilsRPT::printWithSpace);
        }

        //Example 3: Print the elements on the console by ordering them according to their lengths in lower cases and un-repeatedly.
        //           If some elements are in the same length put them in alphabetical order
        public static void printDistinctSortedByLengthThenAlphabeticalLowerCase(List<String> names){

            names.
                    stream().
                    distinct().
                    map(String::toLowerCase).
                    sorted(Comparator.comparing(String::length).thenComparing(t->t.charAt(0))).
                    forEach(t-> System.out.print(t + " "));
        }
}