package com.idoescode;

public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println("Hallo");
        toMilesPerHour(1.5);
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
//

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour > 0) {
            double converter = 0.621421;
            double milesPerHour = kilometersPerHour * converter;
            long returnValue = (long) Math.round(milesPerHour);

            return returnValue;
        }
        return -1;
    }
}
