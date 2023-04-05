package day13dowhilelooparrays;

import java.util.Scanner;

public class DoWhileRPT {
    public static void main(String[] args) {
        /*
            Username is "admin", Password is "pwd123"

            Ask user to enter username and password
            User should see "Enter your username and password" message

            If user enters correct credentials, he should get "You are in your account!" message

            Otherwise, he should see "Enter your username and password" message 3 times
            After 3 times he should get "Your account is blocked" message
	    */
        Scanner input = new Scanner(System.in);
        String userName = "admin";
        String password = "pwd123";
        int counter = 0;

        do{if (counter==3){
            System.out.println("Your account is blocked");break;
        }
            System.out.println("please enter username and password");
            String usrNme= input.next();
            String pswd = input.next();
            if (usrNme.equals(userName) && pswd.equals(password)){
                System.out.println("You are in your account!"); break;
            } else {counter++;}}
            while (true);

    }
}
