package day08nestedifternary;

import java.util.Scanner;

public class NestedIfRPT {
    public static void main(String[] args) {
        /*
            Ask user to enter a password
            If the initial of the password is uppercase
                Check if it is ‘A’ or not.
                If it is ‘A’ the output will be “Valid Password”
                otherwise the output will be “Invalid Password”
                For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid
            If the initial of the password is lowercase
                Check if it is ‘z’ or not.
                If it is ‘z’ the output will be “Valid Password”
                otherwise the output will be “Invalid Password”
                For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid
*/
        Scanner input = new Scanner(System.in);
        System.out.println("please enter password....");
        String pwd = input.next();
        if (pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z') {
            if (pwd.charAt(0) == 'A') {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }
        } else {
            if (pwd.charAt(0) >= 'a' && pwd.charAt(0) <= 'z') {
                if (pwd.charAt(0) == 'z') {
                    System.out.println("Valid Password");
                } else {
                    System.out.println("Invalid Password");
                }
            }
        }


          /*
                Type java code by using nested if.
                Write a program to check if a year is "leap year" or not.
                i) If the year is divisible by 100 then it must be divisible by 400. ==> 1600+, 2000+, 1800-
                ii) If a year is not divisible by 100 then it must be divisible by 4. ==> 2004+, 1996+, 2021-
         */
    int year = 2021;
    if (year%100==0)
    {if(year%400==0){System.out.println("leap year");} else {System.out.println("not leap year");}}
    else {if (year%4==0){System.out.println("leap year");} else {System.out.println("not leap year");}}



    }//main
}//class
