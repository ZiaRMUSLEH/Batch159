package day04scannerclass;

import java.util.Scanner;

public class ScannerRPT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Example 1: Ask user to enter i)Full name ii)Age iii)Height iv)Marital status
        //           Then print them on the console in different lines with a label
        System.out.println("please enter your full name");
        String fullName = input.nextLine();

        System.out.println("please enter your age");
        byte age = input.nextByte();

        System.out.println("please enter your height");
        double height = input.nextDouble();

        System.out.println("please tell me are you married?");
        boolean maritalStatus = input.nextBoolean();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("Is married = " + maritalStatus);

        //Example 2: Ask user to enter two numbers then do addition and multiplication operations with the numbers
        System.out.println("please enter two numbers...");
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();

        System.out.println("addition = "+(firstNum+secondNum));
        System.out.println("multiplication = " + (firstNum*secondNum));

        //Example 3: Ask user to enter 5 digits number like 45673
        //           Print the sum of the first two and the last two digits.
        //           45673 ==> 45 + 73 = 118
        System.out.println("please enter a 5 digit number");
        int num1 = input.nextInt();
        System.out.println(num1%100+num1/1000);



        //Example 4: Ask user to enter width and the length of a rectangle then calculate the perimeter and the area
        // perimeter ==> (2*width + 2*length)  area ==> width*length
        System.out.println("please enter the width of rectangle");
        double width = input.nextDouble();
        System.out.println("please enter the length of length");
        double length = input.nextDouble();

        System.out.println("area is = " + width*length);
        System.out.println("perimeter is = " +(2*width + 2*length));

    }//main
}//class