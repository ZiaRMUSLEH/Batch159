package day20methodoverloadingdatetime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Scanner;

public class DateTimeRPT {
    public static void main(String[] args) {

        //HOW TO GET CURRENT DATE
        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate = " + currentDate);

        //HOW TO GET COMPONENTS OF THE DATE
        System.out.println(currentDate.getYear());//2023
        System.out.println(currentDate.getMonth());//APRIL
        System.out.println(currentDate.getMonthValue());//4
        System.out.println(currentDate.getDayOfMonth());//7
        System.out.println(currentDate.getDayOfWeek());// SUNDAY

        //HOW TO GET CURRENT DATE IN A SPECIFIC ZONE
        //System.out.println(LocalDate.now(ZoneId.of("Asia/Afghanistan")));
        //System.out.println(LocalDate.now(ZoneId.of("Asia/Turkey")));

        //HOW TO GO FUTURE AND PAST
        System.out.println(currentDate.plusYears(4).plusMonths(5).plusDays(6));// 2027-09-22
        System.out.println(currentDate.minusYears(4).minusMonths(5).minusDays(6)); // 2018-11-10

        //Example 1: Jhon was born 12 years 5 months 11 days ago, type code to find the day name of Jhon's birthdate
        LocalDate johnDob = LocalDate.now().minusYears(12).minusMonths(5).minusDays(11);
        System.out.println(johnDob);

        //HOW TO COMPARE TWO DATES
        LocalDate first = LocalDate.of(2035, 5, 7);
        LocalDate second = LocalDate.of(2035, 5, 6);

        System.out.println(first.isAfter(second)); //true
        System.out.println(second.isBefore(first)); // true

        //Example 2: Type code for a booking application.
        //           If booking date is before current date give an error message like "Booking date cannot be past date"
        //           If booking date equals current date give a message like "We will call you when we have availability"
        //           If booking date is after current date give a message like "The ticket was booked"

        Scanner input = new Scanner(System.in);
        System.out.println("please enter year number with 4 digits to book a ticket");
        int year = input.nextInt();
        System.out.println("please enter month number to book a ticket");
        int month = input.nextInt();
        System.out.println("please enter day number to book a ticket");
        int day = input.nextInt();

        LocalDate bookingDate = LocalDate.of(year,month,day);

        if(bookingDate.isBefore(currentDate)){
            System.out.println("Booking date cannot be past date");
        } else if (bookingDate.equals(currentDate)){
            System.out.println("We will call you when we have availability");
        } else {
            System.out.println("The ticket was booked");
        }

        //Example 3: Type code to find the day name of your birth.
        LocalDate myDob = LocalDate.of(1994, 9, 8);
        System.out.println("myDob = " + myDob); //myDob = 1994-09-08
    }
}
