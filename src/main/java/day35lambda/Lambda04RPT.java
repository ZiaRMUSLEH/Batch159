package day35lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lambda04RPT {

    public static void main(String[] args) throws IOException {

     readTextFile();
     System.out.println(checkSpecificWordExistInAllLines("Lambda"));

    }

    //Example 1: Go to LambdaTextFile and print the text in the file on the console
    public static void readTextFile () throws IOException {
       // Files.lines(Path.of("src/main/java/day35lambda/LambdaTextFile.txt")).forEach(UtilsRPT::printWithLnAndSpace);
        Files.lines(Path.of("src/main/java/day35lambda/LambdaTextFile.txt")).forEach(System.out::println);
    }



    //Example 2: Go to LambdaTextFile and check if all lines have "Lambda" word
    public static boolean checkSpecificWordExistInAllLines(String word) throws IOException {
        return
                Files.lines(Path.of("src/main/java/day35lambda/LambdaTextFile.txt")).allMatch(t->t.contains(word));
    }


}