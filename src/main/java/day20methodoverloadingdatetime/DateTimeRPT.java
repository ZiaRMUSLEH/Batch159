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
        int year = currentDate.getYear();
        System.out.println("year = " + year);
        int month = currentDate.getMonthValue();
        System.out.println("month = " + month);
        int day = currentDate.getDayOfMonth();
        System.out.println("day = " + day);


        //HOW TO GET CURRENT DATE IN A SPECIFIC ZONE
        LocalDate kabulTime = LocalDate.now(ZoneId.of("Asia/Kabul"));
        System.out.println("kabulTime = " + kabulTime);
        //LocalDate samsunTime = LocalDate.now(ZoneId.of("Asia/Samsun"));

        //System.out.println(LocalDate.now(ZoneId.of("Asia/Turkey")));

        //HOW TO GO FUTURE AND PAST
        LocalDate futureDate = currentDate.plusYears(4).plusMonths(5).plusDays(-1);
        LocalDate pastDate = currentDate.minusYears(4).minusMonths(5).minusDays(-13);
        System.out.println("futureDate = " + futureDate);// 2027-09-22
        System.out.println("pastDate = " + pastDate);// 2018-11-10

        //Example 1: Jhon was born 12 years 5 months 11 days ago, type code to find the day name of Jhon's birthdate
       LocalDate jhonBd = currentDate.minusYears(12).minusMonths(5).minusDays(11);
        System.out.println("jhonBd = " + jhonBd);

        //HOW TO COMPARE TWO DATES
        LocalDate istanbulDate = LocalDate.now(ZoneId.of("Asia/Istanbul"));
        System.out.println("istanbulDate = " + istanbulDate);//istanbulDate = 2023-04-23
        LocalDate melbourneDate = LocalDate.now(ZoneId.of("Australia/Melbourne"));
        System.out.println("melbourneDate = " + melbourneDate);//melbourneDate = 2023-04-24

        System.out.println(melbourneDate.isAfter(istanbulDate));//true
        System.out.println(istanbulDate.isBefore(melbourneDate)); //true
        System.out.println(kabulTime.isEqual(istanbulDate)); //true

        //Example 2: Type code for a booking application.
        //           If booking date is before current date give an error message like "Booking date cannot be past date"
        //           If booking date equals current date give a message like "We will call you when we have availability"
        //           If booking date is after current date give a message like "The ticket was booked"

        Scanner input = new Scanner(System.in);
        System.out.println("please enter booking date by this order yyyy mm dd ");
        int bookingYear = input.nextInt();
        int bookingMonth = input.nextInt();
        int bookingDay = input.nextInt();

        LocalDate bookingDate = LocalDate.of(bookingYear, bookingMonth, bookingDay);

        if (bookingDate.isBefore(currentDate)){
            System.out.println("Booking date cannot be past date");
        } else if (bookingDate.isEqual(currentDate)){
            System.out.println("We will call you when we have availability");
        } else {
            System.out.println("The ticket was booked");
        }





        //Example 3: Type code to find the day name of your birth.
        LocalDate myDoB = LocalDate.of(1994, 9, 8);
        System.out.println("myDoB = " + myDoB);
    }
}
