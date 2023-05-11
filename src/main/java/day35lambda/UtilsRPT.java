package day35lambda;

public class UtilsRPT {

 public static int getSquare(int a){
     return a*a;
 }
    public static int getCube(int a){
        return a*a*a;
    }
 public static void printWithSpace(Object a){
     System.out.print(a+" ");
 }

    public static void printWithLnAndSpace(Object a){
        System.out.println(a+" ");
    }
 public static int getSumDigits (int a){
     int sum = 0;
      for (int i =a; a>0; a=a/10){
        sum= sum+ a%10;
     }
      return sum;
 }
public static boolean checkToBeEven(int a){
     return a%2==0;
}
    public static boolean checkToBeOdd(int a){
        return a%2!=0;
    }



}