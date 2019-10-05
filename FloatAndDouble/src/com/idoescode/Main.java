package com.idoescode;

public class Main {

    public static void main(String[] args) {
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        double myMinDouble = Double.MIN_VALUE;

        System.out.println("My min float " + myMinFloat);
        System.out.println("My max float " + myMaxFloat);
        System.out.println("My min double " + myMinDouble);
        System.out.println("My max double " + myMaxDouble);

        // int doesn't worry about the remainder, prints 2 for value
        int value = 5 /2 ;
        // Casting or literal float
        float myFloat = (float) 5f /2f;
        float myOtherFloat = 3.24f;

        // use doubles when possible

        double myDouble = 5d / 2d;

        System.out.println("Int " + value + " float " + myFloat + " double " + myDouble);

        double pounds = 3.5;

        double kgs = pounds * 0.4535937;

        System.out.println(kgs);

    }
}
