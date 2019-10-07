package com.idoescode;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner grocery = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = new int[2];

        myIntArray[1] = 3;


        // you can only put in a double into this array
        double[] myDoubleArray = new double[2];

        int[] arrayTwo = {1, 3, 5, 7, 9};
//        calculateAvg();
        //System.out.println(arrayTwo[2]);
        GroceryList myList = new GroceryList();

    }

    public static void calculateAvg() {
        int[] myIntegers = getIntegers(5);

        double avg = 0;

        for (int i = 0; i < myIntegers.length; i++) {
            avg = avg + myIntegers[i];
            System.out.println(avg);
        }

        avg = (double) avg / myIntegers.length;

        System.out.println("Average is " + avg);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values: \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();

        }

        return values;

    }
}
