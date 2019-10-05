package com.idoescode;

public class Main {

    public static void main(String[] args) {
	    boolean isAlien = false;

	    double number = 1234.13d;


	    if (isAlien == false) {
            System.out.println("Not alien");

        }

	    int topScore = 80;
	    // double equals 'cause we have types
	    if (topScore == 100) {
            System.out.println("You got the high score!");
        }

	    if (topScore != 100) {
            System.out.println("Aaaawwww...");
        }

	    if(topScore >= 100) {
            System.out.println("Highest score ever");
        }

	    int secondScore = 60;

        // and operator
	    if (topScore < 100 && topScore > secondScore) {
            System.out.println("Some advanced scores are happening");
        }

	    // or operator
        if (topScore > 0 || secondScore > 0) {
            System.out.println("We have some scores");
        }

        boolean isCar = false;

        if (isCar) {
            System.out.println("Doesn't print");
        }

        if (isCar = true) {
            System.out.println("Actually prints because we reassign isCar");
            // fyi now isCar variable is not used so that should be a sign
            // that something is wrong
        }
        if (!isCar) {
            System.out.println("Does not print");
        }

        if (!!isCar) {
            System.out.println("Does print");
        }
        isCar = false;

        // ternary operator
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is " + wasCar);
        }


        int age = 20;
        // you can write it this way.
        // not sure I'd do it, but it works
        boolean isAdult = age > 18 ? true : false;


        // challenge time!
        double start = 20d;
        double two = 80d;

        double sum = (start + two) * 100d;

        double remainder = sum % 40d;

        boolean doesNotRemain = remainder == 0 ? true : false;

        System.out.println(doesNotRemain);

        if (doesNotRemain == false) {
            System.out.println("Got some remainder");
        }
    }
}
