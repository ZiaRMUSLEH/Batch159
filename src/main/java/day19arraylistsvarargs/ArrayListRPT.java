package day19arraylistsvarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListRPT {
    public static void main(String[] args) {

 /*       List<String> emailDb = new ArrayList<>();
        emailDb.add("abc@gmail.com");
        emailDb.add("bcd@gmail.com");
        emailDb.add("cde@gmail.com");
        emailDb.add("ac@gmail.com");
        emailDb.add("bd@gmail.com");

        //Example 1: Ask user to create an email address
        //           If the email is unused accept it as email address
        //           If the email is used give a message to user and create a unique email address for the user

        Scanner input = new Scanner(System.in);
        System.out.println("please enter an email add");
        String emial = input.next();
        if (emailDb.contains(emial)){
            System.out.println("your entered email is taken, chose any of the following ");
           String curentDate= LocalDate.now().toString().replaceAll("[^0-9]","");
           String curentTime = LocalTime.now().toString().split("\\.")[0].replaceAll("[^0-9]","");
           String newEmail = emial.split("@")[0]+curentDate+curentTime+"@"+emial.split("@")[1];
            System.out.println(newEmail);


        } else {
            System.out.println("your entered email is accepted");
        }*/


        //Example 2: Ask user to enter an integer from 1 to 10
        //           If the number user entered exists in the Database(DB) change the number to "Bingo"
        //           If the number user entered does not exist in the DB add it into the DB
        //           If all records in the DB is "Bingo" give a message to the user like "You won!"
        List<String> dataBase = new ArrayList<>();
        dataBase.add("5");
        dataBase.add("8");
        dataBase.add("2");
        dataBase.add("9");

        int counter = 0;

        Scanner input = new Scanner(System.in);
        do {System.out.println("enter an Integer from 1 to 10");
            String  n = input.next();

            int chk = Integer.valueOf(n);
            if (chk>=1 && chk<=10){
                if (dataBase.contains(n)){
                    dataBase.set(dataBase.indexOf(n), "bingo");
                    counter++;
                } else {dataBase.add(n);}

                if (counter==dataBase.size()){
                    System.out.println("you won!"); break;
                }




            } else {
                System.out.println("Invalid number"); break;
            }


        }while (true);


    }
}
