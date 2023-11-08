package com.java.javadatetimedemo.localdate;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;

public class TimeDemo {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();

        System.out.println("The time when the program is executed is-> "+time);
    }
}
