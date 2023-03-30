package day09nestedternaryswitch;

public class NestedTernaryRPT {
    public static void main(String[] args) {

        /*
                Type java code by using nested ternary.
                Write a program to check if a year is "leap year" or not.
                i) If the year is divisible by 100 then it must be divisible by 400. ==> 1600+, 2000+, 1800-
                ii) If a year is not divisible by 100 then it must be divisible by 4. ==> 2004+, 1996+, 2021-
         */
        int year = 2021;
        String leapYear = year%100==0? year%400==0? "leap year": "not leap": year%4==0 ? "leap year": "not leap year";
        System.out.println(leapYear);

        /*
            Type code to check the password
            If it has more than 8 characters, initial should be 'i'
            If it has no more than 8 characters initial should be 'K'
            Solve the task by using nested-ternary
      */
        String pwd = "Kfsaf";
        String pswd = pwd.length()>8? pwd.charAt(0)=='i'? "True": "False" : pwd.charAt(0)=='K'? "True": "False";
        System.out.println(pswd);

    }//main
}//class
