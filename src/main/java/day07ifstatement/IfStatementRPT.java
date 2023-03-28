package day07ifstatement;

import java.util.Scanner;

public class IfStatementRPT {
    public static void main(String[] args) {

        //Example 1: Type code to check if a number is even or odd.
        int num = 12;

        //1.Way:
        if (num%2==0){
            System.out.println(num + " is an even number");
        } if (num%2!=0){
            System.out.println(num + " is an odd number");
        }

        //2.Way:
        if (num%2==0){
            System.out.println(num + " is an even number");
        } else  if (num%2!=0){
            System.out.println(num + " is an odd number");
        }

        //Example 2: Type code to check if initial of a String is upper case or not
        String s = "Miami";

        //1.Way:
        boolean b = s.charAt(0)<='Z' && s.charAt(0)>='A';
        System.out.println(b);
        //2.Way:
        if (s.charAt(0)<='Z' && s.charAt(0)>='A'){
            System.out.println("initial is an upper case letter");
        }

        //Example 3: Type code to check if a number is positive, negative, or neutral
        int number = -5;
        if (number>0) {
            System.out.println(number+" is a positive number");
        } else if (number<0){
            System.out.println(number +" is a negative number");
        } else {
            System.out.println(number + " is a neutral number");
        }


        //Example 4: Type code to print they name when you know they number
        //           1-->Sunday, 2-->Monday, ... 7-->Saturday
        int dayNumber = 1;

        if (dayNumber==1){System.out.println("sunday");}
        else if (dayNumber==2){System.out.println("monday");}
        else   if (dayNumber==3){System.out.println("tuesday");}
        else  if (dayNumber==4){System.out.println("wednesday");}
        else if (dayNumber==5){System.out.println("thursday");}
        else  if (dayNumber==6){System.out.println("friday");}
        else  if (dayNumber==7){System.out.println("saturday");}
        else {
            System.out.println("invalid day number");
        }


        //Example 1: Ask user to enter day name the print if the day name is week day or weekend day
        //           Monday --> Weekday    Sunday --> Weekend day
        Scanner input = new Scanner(System.in);
        System.out.println("please enter day name...");
        String dayName = input.next().toLowerCase();
        //1.Way:
        if (dayName.equals("monday")){System.out.println("Weekday");}
        else  if (dayName.equals("tuesday")){System.out.println("Weekday");}
        else  if (dayName.equals("wednesday")){System.out.println("Weekday");}
        else if (dayName.equals("thursday")){System.out.println("Weekday");}
        else  if (dayName.equals("friday")){System.out.println("Weekday");}
        else  if (dayName.equals("saturday")){System.out.println("Weekend day");}
        else  if (dayName.equals("sunday")){System.out.println("Weekend day");}
        else {
            System.out.println("Invalid day name");
        }

        //2.Way:
        if (dayName.equals("monday") ||dayName.equals("tuesday") ||
            dayName.equals("wednesday") || dayName.equals("thursday") ||
                dayName.equals("friday") ){System.out.println("Weekday");}
        else if (dayName.equals("saturday") || dayName.equals("sunday") ){System.out.println("Weekend day");}
        else
        {System.out.println("Invalid day name");}

        /*
           Ask user to enter his age, then print his situation according to the given table
           0-4==>Baby  5-12==>Kid  13-20==>Young   21-30==>Adult  31-?==>Undefined
        */
        System.out.println("please enter your age...");
        byte age = input.nextByte();
        if (0<=age && age <=4 ){System.out.println("Baby");}
       else if (5<=age && age <=12 ){System.out.println("Kid");}
        else  if (13<=age && age <=20 ){System.out.println("Young");}
        else  if (21<=age && age <=30 ){System.out.println("Adult");}
        else {System.out.println("Undefined");}

    }//main
}//class
