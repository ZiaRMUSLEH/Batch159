package day36lambda;


public class CoursesRPT {

    private String courseName;
    private int numberOfStudents;
    private double studentScores;
    private String season;

    public CoursesRPT (String courseName, int numberOfStudents, int studentScores, String season) {
        this.courseName = courseName;
        this.numberOfStudents = numberOfStudents;
        this.studentScores = studentScores;
        this.season = season;
    }

    public CoursesRPT () {
    }

    public String getCourseName () {
        return courseName;
    }

    public void setCourseName (String courseName) {
        this.courseName = courseName;
    }

    public int getNumberOfStudents () {
        return numberOfStudents;
    }

    public void setNumberOfStudents (int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public double getStudentScores () {
        return studentScores;
    }

    public void setStudentScores (int studentScores) {
        this.studentScores = studentScores;
    }

    public String getSeason () {
        return season;
    }

    public void setSeason (String season) {
        this.season = season;
    }

    @Override
    public String toString () {
        return
                "courseName='" + courseName + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                ", studentScores=" + studentScores +
                ", season='" + season + '\'';
    }
}