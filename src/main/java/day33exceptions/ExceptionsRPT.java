package day33exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsRPT {
    /*
    1. if you get red underline while you type code, it means it is CompileTime Exception (Checked Exception)
    2. To handle Checked Exception you can use try-catch block
    3. if you use multiple catch-blocks after try block and the Exception classes have parent-child relationship
    child exception class must be typed first, parent must be typed latter

    interview question:
    what is the difference between "throws" and "throw" keywords?
    i. throw is used in method body, throws is used in the method signature line.
    ii. throw can be used many times in a method body, but throws can be used just once.
    iii. after using throw keyword we create an exception class object, but after using throws we type just the name of the exception class
    iv. after using throw keyword we can use just one exception class, but after using throws we can use multiple exception classes
    v. throw keyword handles the exception and lets next codes to be executed, but throws make the code throws exception and stop the execution
     */
    public static void main (String[] args) throws IOException {

readText();
readText1();
    }
    //Ex.1. create a method read text in a text file.

    //1. way used try-catch
    public static void readText ()  {
        try {
            FileInputStream  fis = new FileInputStream("src/main/java/day33exceptions/myTextRPT");
            int k = 0;
            while ((k=fis.read()) !=-1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("There is an issue in the path or the file was deleted");
        } catch (IOException e) {
            System.out.println("Some characters are not in English");
        }
    }
    //2. way used throws keyword
    public static void readText1 () throws IOException {
        FileInputStream fis = new FileInputStream("src/main/java/day33exceptions/myTextRPT");

        int k = 0;
        while ((k=fis.read())!=-1){
            System.out.print((char)k);
        }
    }
}
