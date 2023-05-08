package day32exceptions;

public class Exceptions02RPT {
    /*
    1. whn you use multiple catch blocks after try-block the order of multiple catch blocks does not matter.
    you can put them in any order but following the code order is the best practice
    Note: But some exception classes are the parent of another exception classes, when you use parent-child exception classes
    child exception classes must come first
    2. try block can not be used alone;
        i. try-block+single catch-block
        ii. try-block+multiple catch-block
        iii. try-block+ finally block
        iv. try-block+ single catch-block  + finally block
        v. try-block+ multiple catch-block  + finally block
     */
    public static void main (String[] args) {

        System.out.println(divideByNumberOfCharsInString("240"));
        System.out.println(divideByNumberOfCharsInString("2a4"));
        System.out.println(divideByNumberOfCharsInString("2"));
        System.out.println(divideByNumberOfCharsInString(null));

        System.out.println(divideByNumberOfCharsInString1("240"));
        System.out.println(divideByNumberOfCharsInString1("2a4"));
        System.out.println(divideByNumberOfCharsInString1("2"));
        System.out.println(divideByNumberOfCharsInString1(null));

    }
    //Example 1: Create a method divides an integer converted from a String by 1 less than the number of characters of the String.
    //           String s = "240"; ==> 240 / 2 = 120
    //1.Way: To handle multiple exceptions
    public static int divideByNumberOfCharsInString(String str){
       try{ int a = str.length()-1;
        int b = Integer.valueOf(str);
        return b/a;}
       catch (NumberFormatException e){
           System.out.println(e.getMessage());
           System.out.println("Do not use non-digit characters in valueOf()");
    return 0 ; }
       catch (ArithmeticException e){
           System.out.println(e.getMessage());
           System.out.println("There is a problem in mathematical operation");
           return 0 ; }
       catch (NullPointerException e){
           System.out.println(e.getMessage());
           System.out.println("Do nut use null with some String Class methods");
           return 0 ; }

    }

    //2.Way: To handle multiple exceptions
    public static int divideByNumberOfCharsInString1(String str){
        try{ int a = str.length()-1;
            int b = Integer.valueOf(str);
            return b/a;}
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Exception caught");
            return 0;
        }}

}
