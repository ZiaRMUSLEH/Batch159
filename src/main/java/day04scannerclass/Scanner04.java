package day04scannerclass;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        //Example 1: Ask user to enter width and the length of a rectangle then calculate the perimeter and the area

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter width and length of a rectangle...");
        double width = input.nextDouble();
        double length = input.nextDouble();

        System.out.println("The perimeter is " + (2*width + 2*length));

        System.out.println("The area is " + width*length);

    }

}