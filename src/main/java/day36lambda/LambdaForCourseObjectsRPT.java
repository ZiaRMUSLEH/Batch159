package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaForCourseObjectsRPT {

    public static void main(String[] args) {

        Courses courseTurkishDayTime = new Courses("Turkish Day Time", 45,"spring",98.6);
        Courses courseTurkishNightTime = new Courses("Turkish Night Time", 58,"Summer",85);
        Courses courseEnglishDayTime = new Courses("English Day Time", 29,"Fall",75.6);
        Courses courseEnglishNightTime = new Courses("English Night Time", 60,"Winter",90.8);

        List<Courses> courses = new ArrayList<>();
        courses.add(courseEnglishDayTime);
        courses.add(courseEnglishNightTime);
        courses.add(courseTurkishDayTime);
        courses.add(courseTurkishNightTime);

      System.out.println(checkAvgScoreToBeGreaterThanSpecificValue(courses, 93));
      System.out.println(checkAnyCourseNameContainsSpecificWord(courses, "TURKISH"));
     System.out.println(getCourseAvgHighest(courses));
     System.out.println(getCourseAvgGivenHighest(courses, 3));
        System.out.println(getCourseNumOfStdGivenLowest(courses, 2));

        System.out.println(getAvgNumOfStd(courses));
    }




    //Example 1: Check all average scores if they are greater than 93
    public static boolean checkAvgScoreToBeGreaterThanSpecificValue (List<Courses> courses, int specificNumber){
        return courses.stream().map(Courses::getAvgScore).allMatch(t->t>specificNumber);
    }


    //Example 2: Create a method to check if at least one of the course names contains "Turkish" word with ignoring cases
    private static boolean checkAnyCourseNameContainsSpecificWord (List<Courses> courses, String word) {
        return courses.stream().map(Courses::getCourseName).map(String::toLowerCase).anyMatch(t->t.contains(word.toLowerCase()));
    }


    //Example 3: Create a method to find the course whose average score is the highest
    private static Courses getCourseAvgHighest (List<Courses> courses) {
        return courses.stream().sorted(Comparator.comparing(Courses::getAvgScore).reversed()).findFirst().get();

    }


    //Example 4: Create a method to find the course whose average score is the third highest
    private static Courses getCourseAvgGivenHighest (List<Courses> courses, int level) {
        return courses.
                stream().
                sorted(Comparator.comparing(Courses::getAvgScore).
                        reversed()).
                skip(level-1).
                findFirst().get();

    }


    //Example 5: Create a method to find the course whose number of students is the second lowest
    private static Courses getCourseNumOfStdGivenLowest (List<Courses> courses, int level) {
        return courses.
                stream().
                sorted(Comparator.comparing(Courses::getNumOfStudents)).
                skip(level-1).
                findFirst().get();
    }

    //Example 6: Create a method to find the average number of students in the courses
    private static double getAvgNumOfStd (List<Courses> courses) {
        return courses.stream().map(Courses::getNumOfStudents).reduce(0, (t,u)->t+u) / (double)courses.size();
    }

}