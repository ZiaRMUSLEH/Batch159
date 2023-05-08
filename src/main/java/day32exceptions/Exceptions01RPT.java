package day32exceptions;

public class Exceptions01RPT {
    public static void main (String[] args) {

        System.out.println(getCharFromString("java", 2));
        System.out.println(getCharFromString("java", 4));

        System.out.println(getNumberofCharInString("java"));
        System.out.println(getNumberofCharInString(" "));
        System.out.println(getNumberofCharInString(""));
        System.out.println(getNumberofCharInString(null));

        System.out.println(convertStringToIntegar("123")+1);
        System.out.println(convertStringToIntegar("1a3")+1);

    }
    //Example 1: Create a method to get a character from a String by using index
    public static char getCharFromString(String s, int indx){
        try {return s.charAt(indx);}
        catch (StringIndexOutOfBoundsException e){
            System.out.println("Do not enter index out of range");
            return ' ';
        }
    }
    //Example 2: Create a method to get the number of characters in a String
    public static int getNumberofCharInString(String str){

        try{return str.length();}catch (NullPointerException e){
            System.out.println("This method cannot be used with null");
            return 0;
        }
    }

    //Example 3: Create a method to convert a String to an Integer
    public static int convertStringToIntegar(String str){
       try{ return Integer.valueOf(str);}
       catch (NumberFormatException e){
           System.out.println("Do not use non-digit characters in valueOf()");
           return 0;
       }
    }

}
