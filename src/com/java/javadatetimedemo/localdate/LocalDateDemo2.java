package com.java.javadatetimedemo.localdate;

import java.time.LocalDate;

public class LocalDateDemo2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate tommorow = today.plusDays(1);
        System.out.println("tommorow's date is ->"+tommorow);
    }
}
