package com.java.javadatetimedemo.localdate;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.IsoChronology;

public class StartEndTimeDemo {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2023, 11, 1);
        LocalDate endDate = LocalDate.of(2024, 12, 11);

        Period period = Period.between(startDate, endDate);

        int daysBetween = period.getDays();
        System.out.println("No of dates between the given dates is ->"+daysBetween);

        int monthsBetween  = period.getMonths();
        System.out.println("No of months between the given dates is ->"+monthsBetween);

        int yearsBetween = period.getYears();
        System.out.println("No of years between the given dates is ->"+yearsBetween);

        System.out.println("'Days' 'Months' 'Years' between the given start and end date is "+daysBetween+" days "+monthsBetween+" months "+yearsBetween+" years ");

        IsoChronology chronology = period.getChronology();
        System.out.println("The chronology used is ->"+chronology);
    }
}
