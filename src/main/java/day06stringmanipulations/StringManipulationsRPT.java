package day06stringmanipulations;

public class StringManipulationsRPT {
    public static void main(String[] args) {

        //Example 1: Check if a sentence start with uppercase and ends with dot
        //           I love Java. ==> true     i like Java. ==> false    I like Java ==> false   i like Java ==> false
        String s = "I like Java.";
        boolean a = s.charAt(0)<='Z' && s.charAt(0)>='A';
        boolean b = s.endsWith(".");
        System.out.println(a && b );



        //Example 2: Type code to find the sum of the prices given as Strings.
        //           $12.99 and $25.75 ==> 38.74
        String p1 = "$12.99";
        String p2 = "$25.75";

        String c = p1.replace("$","");
        String d = p2.replace("$","");

        double e = Double.valueOf(c);
        double f = Double.valueOf(d);

        System.out.println((e+f)+"$");



        //Example 3: Get the initials of the first name and the last name in upper case.
        //           "Tom Hanks" ==> TH   "tom hanks" ==> TH   "    tom Hanks    " ==> TH
        String name = "    tom Hanks    ";

        char g = name.trim().toUpperCase().charAt(0);
        char h = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(""+g+h);


        //Example 1: Type code to check if a specific character is unique in a String or not
        //           Hello ==> H is unique, e is unique, o is unique
        String p = "Hello";
        char i = 'l';
        boolean j = p.indexOf(i) == p.lastIndexOf(i);
        System.out.println(j);

        //Example 2: Type code to check if first and the last character are same in a String
        //           ANKARA ==> true     Ankara ==> true      Miami ==> false
        String city = "Miami";

        String k = city.substring(0,1);
        String l = city.substring(city.length()-1);
        System.out.println(k.equalsIgnoreCase(l));

        //Example 3: Type code to check if a String is empty String or not
        //           "" ==> true  -  " " ==> false because there is space character
        String str = "";
        System.out.println(str.isEmpty());

        //Example 4: Type code to check if a String is empty or has just space character or not
        //           "" ==> true   -    " " ==> true    -    "       " => true
        String st = "     ";
        System.out.println(st.isBlank());


    }//main
}//class
