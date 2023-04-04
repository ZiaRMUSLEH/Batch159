package day11forloop;

import java.util.Scanner;

public class ForLoopRPT {
    public static void main(String[] args) {
        //Example 1: Type code to find the sum of integers from 5 to 26

        int sum = 0;

        for(int i = 5; i<27; i++){
            sum = sum+i;
        }
        System.out.println("sum = " + sum);

        //Example 2: Type code to find the multiplication of integers from 5 to 9

        int multiplication = 1;
        for (int i= 5; i<10;i++){
            multiplication = multiplication * i;
        }
        System.out.println("multiplication = " + multiplication);

        //Example 3: Type code to find the sum of the digits of an integer
        //           587 ==> 5+8+7=20
        int a = 587;
        int sumOfDigits = 0;
        for(int i = 587; i>0;i=i/10){
            sumOfDigits = sumOfDigits+i%10;
        }
        System.out.println("sumOfDigits = " + sumOfDigits);
        /*
            Example 1:Type code to get the output like
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */

        for (int i = 1; i<4; i++){
            System.out.println("Week: "+ i);
            for (int j = 1; j<4; j++ ){
                System.out.println("  Day: "+j);
                 } System.out.println("......");
        }

        /*
            2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
            ****
            ****
            ****
            Note: Get the number of the rows and the columns from user
        */
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number of columns and number of rows");
        int columns = input.nextInt();
        int rows = input.nextInt();
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                System.out.print("*");
            }
            System.out.println();}


/*
            Example 1: Type code to get the output like
                        1
                        1 2
                        1 2 3
                        1 2 3 4
                        1 2 3 4 5
        */
        for(int i = 1; i<6; i++){
            for (int j =1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
