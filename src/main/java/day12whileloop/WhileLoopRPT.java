package day12whileloop;

import java.util.Scanner;

public class WhileLoopRPT {
    public static void main(String[] args) {
        //Example 1: Type code to print integers from 3 to 6 on the console
        int a = 3;
        while (a < 7) {
            System.out.println(a);
            a++;
        }

        //Example 2: Type code to print odd integers from 10 to 4 on the console
        int b = 10;
        while (b > 3) {
            if (b % 2 != 0) {
                System.out.println(b);
            }
            b--;
        }

        //Example 3: Type code to find the sum of the even integers from 10 to 13
        int c = 10;
        int sum = 0;
        while (c < 14) {
            if (c % 2 == 0) {
                sum = sum + c;
            }
            c++;
        }
        System.out.println("sum = " + sum);

        //Example 4: Type java code by using while loop,
        //           Write a program that prompts the user to input an integer.
        //           It should then find the sum of the digits of that number.
        //           123 ==> 1+2+3 = 6
        Scanner input = new Scanner(System.in);
        System.out.println("please enter an integer");
        int d = input.nextInt();
        d = Math.abs(d);
        int sumOfDigits = 0;
        while (d > 0) {
            sumOfDigits = sumOfDigits + d % 10;
            d /= 10;
        }
        System.out.println("sumOfDigits = " + sumOfDigits);

        /*
            Example 5: Type java code by using while loop,
                    Write a program that prompts the user to input a number.
                    It should then print the multiplication table of that number.
                    3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
        */
        System.out.println("please enter a number to make multiplication table of it");
        int f = input.nextInt();
        int g = 1;
        while (g < 11) {
            System.out.println(f + " x " + g + " = " + (f * g));
            g++;
        }

        /*
            Example 1: Write a Java Program to Print Rectangle Star Pattern using while Loop
                        ****
                        ****
                        ****
            Note: Get the number of the rows and the columns from user
 */
        System.out.println("please enter row number a column number");
        int row = input.nextInt();
        int column = input.nextInt();
        int e = 0;
        while (e < row) {
            int h = 0;
            while (h < column) {
                System.out.print("* ");
                h++;
            }
            System.out.println();
            e++;
        }

/*
              Example 1:  Ask user to enter an integer.
                          If the integer is less than 100, tell user "Won!"
                          Otherwise, tell user "Lost!"
	    */

        do {
            System.out.println("please enter an integer");
            int game = input.nextInt();
            if (game < 100) {
                System.out.println("Win!");
            } else {
                System.out.println("Lost!");
                break;
            }
        }
        while (true);

    }
}
