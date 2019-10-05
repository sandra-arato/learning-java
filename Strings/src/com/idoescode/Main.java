package com.idoescode;

public class Main {

    public static void main(String[] args) {
	    String myString = "1234";
	    String other = "5432.13";

        System.out.println(myString+other);

        // BUT!

        double myInt = 1000;
        myString = myString + myInt;
        // java converts it to a double! amazing, huh?
        System.out.println(myString);
    }
}
