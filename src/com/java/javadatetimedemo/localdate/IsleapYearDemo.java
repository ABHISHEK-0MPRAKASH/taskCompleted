package com.java.javadatetimedemo.localdate;

import java.time.LocalDate;
import java.time.Period;

public class IsleapYearDemo {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 11, 1);
        LocalDate endDate = LocalDate.of(2024, 12, 11);

        System.out.println("Status of startdate being leapyear is ->"+startDate.isLeapYear());
        System.out.println("Status of enddate being leapyear is ->"+endDate.isLeapYear());
    }
}
