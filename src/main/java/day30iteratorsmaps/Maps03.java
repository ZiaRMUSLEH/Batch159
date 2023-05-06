package day30iteratorsmaps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps03 {

    /*
           Example 1: Type code to find the number of occurrences of letters in a sentence
                      Java is easy ==> J=1, a=3, v=1, i=1, s=2, y=1
     */

    public static void main(String[] args) {

        String sentence = "java is easy";
        sentence = sentence.replaceAll("\\s", "");
        String [] charachters = sentence.split("");

        HashMap<String, Integer> occurance = new HashMap();
        for (String w: charachters){
          Integer occnum =  occurance.get(w);
          if (occnum == null){
              occurance.put(w, 1);
          }else {
              occurance.put(w, occnum+1);
          }
        }
        System.out.println("occurance = " + occurance);


    }

}