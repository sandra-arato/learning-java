package com.idoescode;

import java.sql.Date;
import java.time.LocalDate;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);

        System.out.println(getDaysInMonth(1, 2020));  // 31
        System.out.println(getDaysInMonth(2, 2020)); // 29
        System.out.println(getDaysInMonth(2, 2018)); // 28
        System.out.println(getDaysInMonth(-1, 2020)); // -1
        System.out.println(getDaysInMonth(1, -2020)); // -1
    }

    public static boolean isLeapYear(int year) {
        boolean isLeap = false;
        if (year < 1 ) {
//            System.out.println("error");
            return false;
        }

        if (year % 4 == 0 && year % 100 != 0) {
            isLeap = true;
        }
        if (year % 400 == 0) {
            isLeap = true;
        }

        String leap = isLeap ? "leap year" : "not leap year";

//        System.out.println("Year " + year + " is " + leap);
        return isLeap;

    }
    // gets the number of days in month
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }

        if (year < 1 || year > 9999) {
            return -1;
        }


        Date date = Date.valueOf("" + year +"-" + month + "-01");
//        System.out.println(date);

        LocalDate newDate = date.toLocalDate().plusMonths(1);
        int days = newDate.minusDays(1).getDayOfMonth();
//        System.out.println(days);

        return days;

    }
}
