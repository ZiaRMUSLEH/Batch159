package day32exceptions;

public class Exceptions03RPT {
    /*
    1. we sometimes need to throw Exceptions for specific scenarios.
    to do that, use "throw" keyword in method body together with "new" keyword and "Exception Classes constructor"
    2. if you want to add message to your exception type it inside the "Exception class constructor" parenthesis
    like; throw new IllegalArgumentException("Age cannot be negative");
     */

    public static void main (String[] args) {

        printAge(25);
       // printAge(-12);

        printMathGrade(45);
        //printMathGrade(123);
        printMathGrade(-45);



    }
    //Example 1: Create a method prints ages and throws Exception for negative ages.
    public static void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println("your age is: "+age);
    }
    //Example 2: Create a method prints the student's math grades and throws Exception for the values less than 0 and greater than 100
    public static void printMathGrade(int grade){
        if(grade<0 || grade>100){
            throw new IllegalArgumentException("Grade cannot  be less than zero or greater than hundred");
        }
        System.out.println("your math grade is: "+grade);
    }
}

