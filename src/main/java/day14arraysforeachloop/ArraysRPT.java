package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysRPT {
    public static void main(String[] args) {

/*        //Example 1: Create an integer array with 4 elements, then find the sum of all elements
        int nums[]=new int[4];
        nums[0]=5;
        nums[1]=4;
        nums[2]=1;
        nums[3]=10;
        int sum = 0;
        for (int w: nums){
            sum= sum+w;
        }
        System.out.println("sum = " + sum);

        //Example 2: Create a String array with the length 5, print the elements whose length is more than 6 on the console.
String cities[] = new String[5];
        cities[0] = "Miami";
        cities[1] = "New York";
        cities[2] = "Jacksonville";
        cities[3] = "California";
        cities[4] = "Tampa";
        for (String w: cities){
            if (w.length()>6){
                System.out.print(w+" ");
            }
        }
        System.out.println();
        //Example 3: Create a String array with the length 5, print the elements before "California" on the console.
        String city[] = new String[5];
        city[0] = "Miami";
        city[1] = "New York";
        city[2] = "Jacksonville";
        city[3] = "California";
        city[4] = "Tampa";
        for (String w: cities){
            if (w.equals("California")){break;}
            System.out.print(w+" ");
        }
        System.out.println();
        //Example 4: Create a String array with the length 5, print the elements except "California" and "Miami" on the console.
        String c[] = new String[5];
        c[0] = "Miami";
        c[1] = "New York";
        c[2] = "Jacksonville";
        c[3] = "California";
        c[4] = "Tampa";
        for (String w: cities){
            if (w.equals("California")||w.equals("Miami")){continue;}
            System.out.print(w+" ");
        }

 */       //Example 1: Type code lets user enter many student names into an array.
        //           Whenever user wants he should be able to quit
        //           When I quit or complete I should be able to see all elements on the console.

        Scanner input = new Scanner(System.in);
        System.out.println("please enter number of students you want to add");
        int numOfStds = input.nextInt();
        int ndx = 0;
        String stdsNames[]=new String[numOfStds];
        System.out.println("to quite enter 'q'");
        do{System.out.println("please enter name of student");
            String nameOfStd = input.next();
            if (nameOfStd.equalsIgnoreCase("q")){break;}
            else {
                stdsNames[ndx]=nameOfStd;
               }
            ndx++;  }
        while (ndx<numOfStds);
        System.out.println(Arrays.toString(stdsNames));
        for (String w: stdsNames){
            if(w==null){break;} else {
                System.out.print(w+" ");
            }}


    }
}
