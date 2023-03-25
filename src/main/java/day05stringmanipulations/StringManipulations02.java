package day05stringmanipulations;

import java.util.Scanner;

    /*
        1)replaceAll(regex, newCharacter); method puts new character instead of group of data taken by regex.
        2)contains(char); checks if the given character exists in the String or not.
        3)length(); method gives you the number of characters in the String.
     */

public class StringManipulations02 {

    /*
        Regular Expressions(Regex) are for getting a "group of data"

        1)All upper case letters: [A-Z]
        2)All lower case letters: [a-z]
        3)All digits: [0-9]
        4)All letters: [A-Za-z]
        5)All vowels: [aeiouAEIOU]
        *6)All punctuation marks: \\p{Punct}

        7)All characters different from upper cases: [^A-Z]
        8)All characters different from lower cases: [^a-z]
        9)All characters different from digits:[^0-9]
        10)All characters different from all letters: [^A-Za-z]

     */

    public static void main(String[] args) {
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
        System.out.println("Enter your password...");
        String pwd = input.nextLine();

        //1)Password must have at least 8 character
        boolean firstRule = pwd.length()>7;

        //2)Password must not have space character
        boolean secondRule = !pwd.contains(" ");

        //3)Password must have at least an uppercase character
        boolean thirdRule = pwd.replaceAll("[^A-Z]", "").length()>0;

        //4)Password must have at least a lowercase character
        boolean fourthRule = pwd.replaceAll("[^a-z]","").length()>0;

        //5)Password must have at least a symbol(Characters different from letters and digits)
        boolean fifthRule = pwd.replaceAll("[A-Za-z0-9]", "").length()>0;

        //6)Password must have at least a digit
        boolean sixthRule = pwd.replaceAll("[^0-9]","").length()>0;

        System.out.println(firstRule && secondRule && thirdRule && fourthRule && fifthRule && sixthRule);
    }
}