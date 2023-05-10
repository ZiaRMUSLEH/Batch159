package day33exceptions;

public class ExceptionRunnerRPT {
    /*
    1. to declare your own strict rules on your application, you can create your own exception classes (custom exception classes)
    for example, if using negative values for age is so dangerous, your can create "IllegalAgeException Class" and you throw "IllegalAgeException"
    when the age is negative.
    2. when you name a custom exception class use "exception" word at the end of the name.
    3. if you want to create custom checked exception extend to exception class
    4. every exception class must have constructor and the constructor should use the parent constructor as well
    5. if you want to create unchecked exception extend to RuntimeException class
     */

    public static void main (String[] args) throws IllegalAgeException {

        printAge1(78);
        //printAge1(-5);
        printAge2(45);
       // printAge2(-8);

        printMathGrade(45);
        //printMathGrade(-12);
    }
//Example 1: Create a method to print user's age
    //1.Way:
    public static void printAge1(int age){
        if(age<0) {
            try{
                throw new IllegalAgeException("age can not be negative");
            } catch (IllegalAgeException e){
                System.out.println(e.getMessage());
            }

        } else {
            System.out.println("your age is: "+age);
        }
    }
    //2. way
    public static void printAge2 (int age) throws IllegalAgeException {
        if (age<0){
            throw new IllegalAgeException("age can not be negative");
        } else {
            System.out.println("your age is: " +age);
        }
    }
//Example 2: Create a method to print student's math grades
    public static void printMathGrade (int grade) {
        if (grade > 100 || grade < 0) {
                throw new IllegalGradeExceptionRPT("grade can not be less than 0 or grater than 100");
        } else {
            System.out.println("your math grade is: " + grade);
        }

    }


}
