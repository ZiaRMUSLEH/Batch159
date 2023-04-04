package day12whileloop;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //while loop
        int i = 1;

        while(i<1){

            System.out.println("I am while loop");

            i++;

        }

        //do-while loop
        int k = 1;

        do{
            System.out.println("I am do-while loop");
            k++;

        }while(k<1);

        //Note: while-loop checks the condition first then execute the loop body.
        //      if the condition is false loop body will not be executed even once.
        //      I mean zero execution is possible in while-loop

        //Note: do-while-loop execute the loop body then checks the condition
        //      if the condition is false loop body will be executed once.
        //      I mean zero execution is impossible in do-while-loop

        /*
              Example 1:  Ask user to enter an integer.
                          If the integer is less than 100, tell user "Won!"
                          Otherwise, tell user "Lost!"
	    */
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Enter an integer");
            int num = input.nextInt();

            if(num<100){
                System.out.println("Win!...");
            }else{
                System.out.println("Lost!...");
                break;
            }
        }while(true);
    }
}