package day09nestedternaryswitch;

import java.util.Scanner;

public class SwitchRPT {
    public static void main(String[] args) {

        //Example 1: Type code to display day numbers for the day names
        //           Sunday==>1, Monday==>2, ... ,Saturday==>7, Tom==>Invalid day name`

        String dayName = "tom";

        switch (dayName.toLowerCase()){
            case "monday": System.out.println(1); break;
            case "tuesday": System.out.println(2); break;
            case "wednesday": System.out.println(3); break;
            case "thursday": System.out.println(4); break;
            case "friday": System.out.println(5); break;
            case "saturday": System.out.println(6); break;
            case "sunday": System.out.println(7); break;
            default:
                System.out.println("Invalid day name");
        }


        //Example 1: Type code to print "Vowel" for a,e,i,o,u and "Not vowel" for other letters

        String a = "a";
        switch (a.toLowerCase()){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Vowel"); break;
            case "b":
            case "c":
            case "d":
            case "f":
            case "g":
            case "h":
            case "j":
            case "k":
            case "l":
            case "m":
            case "n":
            case "p":
            case "q":
            case "r":
            case "s":
            case "t":
            case "v":
            case "w":
            case "x":
            case "z":
                System.out.println("not vowel"); break;
            default:
                System.out.println("Undefined");

        }

        /*
           Example 1:
           If user enters 9 the code will print September, October, November, December
           If user enters 5 the code will print May, June, July, August, September, October, November, December
        */
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a month number...");
        short monthNum = input.nextShort();

        switch (monthNum){
            case 1 : System.out.println("January");
            case 2 : System.out.println("February");
            case 3 : System.out.println("March");
            case 4 : System.out.println("April");
            case 5 : System.out.println("May");
            case 6 : System.out.println("June");
            case 7 : System.out.println("July");
            case 8 : System.out.println("August");
            case 9 : System.out.println("September");
            case 10 : System.out.println("October");
            case 11 : System.out.println("November");
            case 12 : System.out.println("December"); break;
            default:
                System.out.println("invalid month number");
        }

        //Example 1: Create a calculator does +, -, *, /, %

        System.out.println("please enter an operator sign among this +, -, *, /, %");
        char opr = input.next().charAt(0);
        System.out.println("please enter 2 numbers....");
        double b = input.nextDouble();
        double c = input.nextDouble();
        switch (opr){
            case '+': System.out.println(b+" " +opr+" "+c+ " = "+(b+c)); break;
            case '-': System.out.println(b+" " +opr+" "+c+ " = "+(b-c)); break;
            case '*': System.out.println(b+" " +opr+" "+c+ " = "+(b*c)); break;
            case '/': System.out.println(b+" " +opr+" "+c+ " = "+(b/c)); break;
            case '%': System.out.println(b+" " +opr+" "+c+ " = "+(b*c/100)); break;
            default:
                System.out.println("Invalid operation sign");
        }



    }//main
}//class
