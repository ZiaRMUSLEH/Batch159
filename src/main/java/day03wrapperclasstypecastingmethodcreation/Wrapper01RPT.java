package day03wrapperclasstypecastingmethodcreation;

public class Wrapper01RPT {
    /*
        1)Java created "Wrapper Class" for every "primitive data type" by adding methods next to the primitive value
        2)"Wrapper Class"es are "non-primitive" that is why they are stored in "Heap Memory"
        3)  byte ==> Byte
            short ==> Short
            int ==> Integer
            long ==> Long
            float ==> Float
            double ==> Double
            char ==> Character
            boolean ==> Boolean

     */

    public static void main(String[] args) {

        byte age = 12;// When you put "." after "age" you will not see any method
        Byte stdAge = 13;// When you put "." after "stdAge" you will see many methods

        System.out.println(Byte.MIN_VALUE);// -128
        System.out.println(Byte.MAX_VALUE);// 127

        //Example 1: Find the sum of the min and max value of short data type
        short min = Short.MIN_VALUE;
        short max = Short.MAX_VALUE;
        System.out.println(min+max);

        //Example 2: Find the size of the int and float and long
        System.out.println(Integer.SIZE);
        System.out.println(Float.SIZE);
        System.out.println(Long.SIZE);

        //Note: MIN_VALUE, MAX_VALUE, SIZE, etc are "variables" contain "constant values"
        //      If a variable has constant value, use just upper cases to name, and use "_" between the words.
        System.out.println(Integer.max(89,56));
        System.out.println(Long.min(4564564564654l, 64654564564564l));
        System.out.println(Integer.parseInt("45", 5));


        //How to convert "primitive data type" to its "wrapper class" or How to convert "wrapper class" to its "primitive data type"

        //Converting "primitive data type" to its "wrapper class" is called "Autoboxing"
        int a = 65;
        Integer wrappera = a;


        //Converting "wrapper class" to its "primitive data type" is called "Unboxing"
        Short s = 56;
        short primitives = s;

    }
}