package day35lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Lambda04RPT {

    public static void main(String[] args) throws IOException {

     readTextFile();
     System.out.println(checkSpecificWordExistInAllLines("Lambda"));
        System.out.println(getWordsInListDistinctly("e"));
        System.out.println(getWordsLengthLessThanSpecificLength(6));

        System.out.println(getTheTotalNumOfLetters());

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

    //Example 3: Get the words ends with 'e' in a list distinctly

    public static List<String> getWordsInListDistinctly (String word) throws IOException {
        return Files.lines(Path.of("src/main/java/day35lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).distinct().filter(t->t.endsWith(word)).collect(Collectors.toList());
    }



    //Example 4: Get the words whose length is less than 6 put them in a list in lowercase and reverse order.

    public static List<String> getWordsLengthLessThanSpecificLength (int specificNumber) throws IOException {
        return Files.lines(Path.of("src/main/java/day35lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.length()<specificNumber).
                map(String::toLowerCase).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
    }

    //Example 5: Create a method to find total number of all the letters used in the text file.
    public static int getTheTotalNumOfLetters () throws IOException {
        return Files.lines(Path.of("src/main/java/day35lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                map(t -> t.replaceAll("[^A-Za-z]", "")).
                map(String::length).
                reduce(Math::addExact).
                get();
    }
}