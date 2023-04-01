package day10forloops;

public class ForLoopRPT {
    public static void main(String[] args) {

        //Example 1: Type code to print "Hi!" 5 times on the console
        for(int i = 0; i<5; i++){
            System.out.println("Hi!");
        }
        System.out.println("=============================");
        //Example 2: Type code to print integers from 12 to 3
        for (int i = 12; i>2; i--){
            System.out.println(i);
        }

        System.out.println("=============================");
        //Example 3: Type code to print "even" integers from 7 to 12
        for (int i = 7; i<13; i++){if(i%2==0){
            System.out.println(i);
        }}
        System.out.println("=============================");
        //Example 1: Put "*" between 2 consecutive characters and to the end in a String.
        String a = "java";
        for (int i = 0; i<a.length(); i++){
            char ch = a.charAt(i);
            System.out.print(ch+"*");
        }

        System.out.println();

        System.out.println("=============================");
        //Example 2: Type code to print unique characters in a String. Hello ==> Heo
        String b = "Hello";

        for (int i = 0; i<b.length(); i++){
            String str = b.substring(i, i+1);
            if (b.indexOf(str) == b.lastIndexOf(str)){
                System.out.print(str);
            }
        }
        System.out.println();
        System.out.println("=============================");
        //Example 3: Type code to reverse a String
        //           For Example: Tom ==> moT
        String c = "Tom";
        String d = "";

        for (int i = c.length()-1; i>=0; i--){
            String str = c.substring(i, i+1);
            d= d+str;
        }
        System.out.println(d);
    }
}
