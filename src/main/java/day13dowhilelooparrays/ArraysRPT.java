package day13dowhilelooparrays;

import java.util.Arrays;

public class ArraysRPT {
    public static void main(String[] args) {


        //How to create an Array

        String studentNames[]=new String[3];

        //How to add elements into an array
        studentNames[0]="ahmad";
        studentNames[1]="mehmet";
        studentNames[2]="akif";

        //How to print an array on the console
        System.out.println(Arrays.toString(studentNames));

        //How to get a specific element from an array
        System.out.println(studentNames[2]);

        //How to get number of elements in an array
        int lenghtOfArray = studentNames.length;
        System.out.println("lenghtOfArray = " + lenghtOfArray);

        //Example 1: Find the total number of characters used in stdNames array elements
        int totalNumberOfCharacters = 0;
        for (String w: studentNames){
            totalNumberOfCharacters = totalNumberOfCharacters+w.length();
        }
        System.out.println("totalNumberOfCharacters = " + totalNumberOfCharacters);
    }
}
