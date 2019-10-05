package com.idoescode;

public class Main {

    public static void main(String[] args) {
        int value = 10000;
        int myMin = Integer.MIN_VALUE;
        int mMax = Integer.MAX_VALUE;

        System.out.println("Integer " + myMin + " Max " + mMax);
        // overflow happens
        System.out.println(mMax + 1);
        // underflow happens - comp skips back to the max number
        System.out.println(myMin - 1);

        // throws error
        // int myMaxTest = 2_147_483_647 + 1;
        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;


        System.out.println("Min byte " + myMinByte);
        System.out.println("Max byte " + myMaxByte);

        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;


        System.out.println("Min short " + myMinShort);
        System.out.println("Max short " + myMaxShort);

        long myLongValue = 100L;

        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;


        System.out.println("Min long " + myMinLong);
        System.out.println("Max long " + myMaxLong);

        byte myNewBytee = (byte) (myMinByte / 2);
        byte divider = 2;

        // Challenge

        byte one = 126;
        short two = 10000;
        int three = 1_000_000;
        long four = 50_000L + 10L
                * (one + two + three);

        System.out.println(four);
        // prints 10_151_260
    }
}
