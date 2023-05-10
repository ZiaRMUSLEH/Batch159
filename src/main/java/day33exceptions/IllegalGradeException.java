package day33exceptions;

public class IllegalGradeException extends RuntimeException{

    public IllegalGradeException(String msg){
        super(msg);
    }

}