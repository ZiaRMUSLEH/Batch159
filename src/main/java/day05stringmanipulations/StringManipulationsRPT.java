package day05stringmanipulations;

import java.util.Scanner;

public class StringManipulationsRPT {
    public static void main(String[] args) {


        //Example 1: Change the full name like initials are in upper cases, other characters are in lower cases
        //           TOM HANKS ==> Tom Hanks    or  tom hanks ==> Tom Hanks
        String name = "TOM HANKS";

        String a = name.substring(0,1);
        String b = name.substring(1,3).toLowerCase();
        String c = name.toUpperCase().split(" ")[1].substring(0,1);
        String d = name.toLowerCase().split(" ")[1].substring(1);

        System.out.println(a+b+" "+c+d);

        /*
            Check the password according to the given rules;
                1)Password must have at least 8 character
                2)Password must not have space character
                3)Password must have at least an uppercase character
                4)Password must have at least a lowercase character
                5)Password must have at least a symbol(Characters different from letters and digits)
                6)Password must have at least a digit
        */
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your pwd...");
        String pwd = input.nextLine();

        boolean f = pwd.length()>7;
        System.out.println(f);
        boolean g = !pwd.contains(" ");
        System.out.println(g);
        boolean h = pwd.replaceAll("[^A-Z]", "").length()>0;
        System.out.println(h);
        boolean i = pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println(i);
        boolean j = pwd.replaceAll("[a-zA-Z0-9]", "").length()>0;
        System.out.println(j);
        boolean k = pwd.replaceAll("[^0-9]", "").length()>0;
        System.out.println(k);

        System.out.println(f&&g&&h&&i&&j&&k);




    }
}
