package day03wrapperclasstypecastingmethodcreation;

public class MethodCreation01RPT {

    public static void main(String[] args) {

        //Using a method inside the "main method" is called "Method Call"
        //Actual values used in method call are called "Argument"s
        //Variables created in method parenthesis are called "Parameter"s
        //Note: If a method just prints something on the console make "return type" as "void"
        //      If a method does not return a new data, its "return type" must be "void"


      //1.
        System.out.println(multiply(3,4,1));

        //2.
        System.out.println(preimeterOfRectangle(5,7));

        //3.
        System.out.println(getSurfaceAreaOfRectangularPrism(2.5,5,8.5));

        //4.
        nameExclamtion("Ahmad");


    }//mian
    // Example 4: Create a method prints the given name on the console with "!" at the end
    // Tom ==> Tom!

    private static void nameExclamtion(String name) {
        System.out.println(name +"!" );
    }


    //Example 3: Create a method calculates the surface area of a rectangular prism
    private static double getSurfaceAreaOfRectangularPrism(double a, double b, double c) {
        return 2*b*c + 2*a*c + 2*a*b;
    }



    //Example 2: Create a method calculates the perimeter of a rectangle
    private static int preimeterOfRectangle(int a, int b) {
        return 2*a + 2*b;
    }

    //Example 1: Create a method multiplies three given integers
    public static int multiply (int a, int b, int c){
        return a*b*c;
    }




}//class