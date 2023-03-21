package day02variables;

public class VariablesRPT {


        //Primitive Data Types: byte - short - int - long - float - double - char - boolean
        //                      byte - short - int - long are for "whole numbers"
        //                      float - double are for "decimal values"
        //                      char is for "single characters"
        //                      boolean is for "true - false values"

        //char data type: char is for a single character. Like A, ?, 5 etc.
        //                When you use a value for "char"s, put it between single quotes
        //                char uses 16 bits(2 bytes) in memory
        char initial = 'A';

        //byte data type: byte is for whole numbers. Like 23, 120, 8, -98, etc.
        //                byte can have values from -128 to 127
        //                byte uses 8 bits(1 byte) in memory
        byte age = 45;

        //short data type:short is for whole numbers. Like 23, 145, 2987, etc.
        //                short can have values from -32768 to 32767
        //                short uses 16 bits(2 bytes) in memory
       short numOfPeopleInAnApartment = 2500;

        //int data type: int is for whole numbers.Like 43, 23987, 23000000, 1000000000, etc.
        //               int can have values from -2,147,483,648 to 2,147,483,647
        //               int uses 32 bits(4 bytes) in memory
         int populationOfCountry = 4500000;

        //long data type: long is for whole numbers. Like 45000000, etc.
        //                long can have values from  -9,223,372,036,854,755,808 to 9,223,372,036,854,755,807
        //                long uses 64 bits(8 bytes) in memory.
        //Note: If the value of a "long variable" is out of range of the "int", put "L" to the end of the value
         long populationOfTheWorld = 7200000000L;
         long profit = 23000000;

        //float data type: float is for decimal values. Like 2.34 - 5.234 - etc.
        //                 float uses 32 bits in memory
         float priceOfShirt = 12.99F;

        //double data type: double is for decimal values. Like 3.24356897
        //                  double uses 64 bits in memory
         double weightOfACell = 0.00000000000234;

        //Non-primitive data types: They can be created by Java, like String, Arrays, Scanner, ...
        //                          They can be created by developers, like Variables01, Variables02, etc.
        //                          Non-primitive data types are infinitely many.

        //String data type: String is for multiple characters.
        //                  Put the value between double quotes.
        public String nameOfStd = "Tom Hanks";

        //What is the difference between "primitive data types" and "non-primitive data types"?
        //1)primitive data types created by Java, developers cannot create primitive data types
        //  but non-primitive data types can be created by both Java and developers
        //2)primitive data type names start with lower cases, non-primitive data type names start with upper cases.
        //3)primitive data types are just 8, non-primitive data types are infinitely many.
        //4)primitive data types are stored in "Stack Memory", non-primitive data types are stored in "Heap Memory"
        //  Note: "Stack Memory" stores i)primitive data types and ii)addresses(reference) of non-primitive data types
        //        "Heap Memory" stores non-primitive data types
        //5*)non-primitive data types have methods together with the value, but primitive data types do not have methods
        //  primitive data types have just value.

        public int num = 45;
        public String city = "Miami";

        //"main method" works first in an application, like an engine in a car.
        //Every application needs a "main method", if you do not have "main method" application cannot run.

        //"void" is one of the "return type" in a method.
        //If a method does not produce a new data make the "return type" void.

        //How to create a "main method"?
        public static void main(String[] args) {
            String countryName = "Germany";
            System.out.println(countryName.toUpperCase());
            System.out.println(countryName.length());
            //Example 1: Create two short variables and print their sum on the console
            short s1 = 12;
            short s2 = 23;
            System.out.println(s1 + s2);

            //Example 2: Create 2 variables for prices then print their sum on the console.
            double shirtPrice = 12.99;
            double shoesPrice = 124.99;
            System.out.println(shirtPrice + shoesPrice);

            //Example 3: Create a variable for student's age and another variable for population of a country.
            //           Print their difference on the console.
            byte stdAge = 13;
            int populationOfGermany = 83000000;
            System.out.println(populationOfGermany - stdAge);

            //Note: If you use different data types in a mathematical operation, the result will be in the largest data type.
            //      4 / 1.2 ==> double         2.4F * 5 ==> float

            //Note: If you use same data type in a mathematical operation result will in the data type
            //      When you divide an int by another int, the result can be double like in 6/5=1.2
            //      but Java makes the data type of the result in int as well.
            //      To convert double to int Java removes the decimal part so 1.2 will be 1
            //      6 / 2 ==> int         6 / 5 ==> int
            System.out.println(6/5);// 1

            //What if you want to see 1.2 when you divide 6 by 5?
            System.out.println(6/5.0);// 1.2

            //Example 1: Estimate the result of the given operation
            //           (2 + 4.6) / 3 - 4 * 2
            System.out.println((2 + 4.6) / 3 - 4 * 2);// -5.8

            //Note: Order of operations in Math i)Do the operations in the parenthesis
            //                                  ii)Do multiplications and divisions
            //                                  iii)Do additions and subtractions

    }//main
}//class
