package day04scannerclass;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Example 1: Ask user to enter 5 digits number like 45673
        //           Print the sum of the first two and the last two digits.
        //           45673 ==> 45 + 73 = 118

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a 5 digit number...");
        int num = input.nextInt();

        int firstTwo = num/1000;

        int lastTwo = num%100;

        System.out.println("The sum is " + (firstTwo + lastTwo));
    }

}