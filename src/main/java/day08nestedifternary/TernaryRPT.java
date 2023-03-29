package day08nestedifternary;

public class TernaryRPT {
    public static void main(String[] args) {

        //Example 1: Type code to check if a number is positive or not
        int a = 4;
        String a1 = a>0? "positive":"negative";
        System.out.println(a1);

        //Example 2: Type code to check if a number is even or odd
        String a2 = a%2==0? "even": "odd";
        System.out.println(a2);

        //Example 3: Type code to find the minimum of two integers
        int b = 7;
        int b1 = a>b? a:b;
        System.out.println(b1);

        //Example 4: Type code to calculate the "absolute value" of a number
        //           5 ==> 5        -5 ==> -1*-5         0 ==> 0
        int c = -7;
        int c1 = c>0? c : c*-1;
        System.out.println(c1);

        //Example 5:  You have 2 integers;
        //            If both of the integers are positive do multiplication.
        //            Otherwise, return "I do not know how to multiply"
        int w = 6;
        int q = 5;
        Object r = w>0 && q>0? w*q : "I do not know how to multiply";
        System.out.println(r);

        //Example 6: You have 2 integers
        //           If both are positive do addition
        //           Otherwise return the maximum one
        int h = w>0 && q>0? w+q: w>q? w:q;
        System.out.println(h);

    }//main
}//class
