package Object_Orianted_Programming.OOP_four.In_built_Packages.java_time;

/*
java.time
Description: Provides classes for date and time operations.
Classes:
LocalDate, LocalTime, LocalDateTime, Duration, etc.
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("DateTime: " + dateTime);
    }
}

