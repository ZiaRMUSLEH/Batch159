package day21datetimestringbuilder;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeRPT {
    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        //How to format time
        //"hh" uses 12 hours system, "HH" uses 24 hours system
        //Using "a" at the end it tells you if it is AM or PM
        String format = currentTime.format(DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println(format);

        LocalDateTime currentDateAndTime = LocalDateTime.now();
        System.out.println("currentDateAndTime = " + currentDateAndTime);
        // 2023-04-16T11:15:58.115333

        LocalDateTime tokyoDateAndTime = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("tokyoDateAndTime = " + tokyoDateAndTime);
        //2023-04-18T00:41:03.640894200



    }
}
