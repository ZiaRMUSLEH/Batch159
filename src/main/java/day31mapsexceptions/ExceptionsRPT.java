package day31mapsexceptions;

public class ExceptionsRPT {
    /*
    1. every system needs strict rules like traffic rules in cities
        java is a system, it needs some strict rules which are called "Exceptions"
    2. when you get "Exceptions" your application will be blocked, your execution will be stopped.
    after getting many "Exception" your next codes cannot be executed.
    if you do not want your application to be blocked, you handle exceptions
    to handle exceptions we use try-catch block.
    3. in try block, java will try to execute your code.
    if there is no issue in execution, java does not use catch block
    if any issue occurred in try block, java will go to the catch block and executes codes in catch block.

     */
    public static void main (String[] args) {
        System.out.println(division1(6, 3));
        System.out.println(division1(8, 4));
        System.out.println(division1(0, 4));
        System.out.println(division1(6, 0));

        System.out.println(division2(6, 0));

        String[] arr = {"Tom", "Ajda", "Brad", "Cuneyt", "Angelina"};

        System.out.println(getElementFromStringArray(arr, 3));
        System.out.println(getElementFromStringArray(arr, 1));
        System.out.println(getElementFromStringArray(arr, 6));
        System.out.println(getElementFromStringArray(arr, -3));

    }
    //Example 1: Create a method divides two integers
    //1.Way: Not recommended
    public static int division1 (int a, int b){
        if(b==0){
            System.out.println("do not divide a number by zero");
            return 0;
        }else {
        return a/b;}
    }
    //2.Way: Recommended
    public static int division2 (int a, int b){

        try{return a/b;}
        catch (ArithmeticException e){//ArithmeticException is thrown if you break any mathematical rule.
            System.out.println("do not divide a number by zero");
            return 0;
        }
    }
    //Example 2: Create a method return any element from an array by using the index of the element
    public static String getElementFromStringArray(String[] arr, int idx){

        try{
            return arr[idx];
        }catch(ArrayIndexOutOfBoundsException e){//ArrayIndexOutOfBoundsException is thrown if non-existing index was used.
            return arr[arr.length-1];
        }

    }

}
