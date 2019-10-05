package com.idoescode;

public class Main {

    public static void main(String[] args) {
        // equal operator is an assign operator
	    int result = 1 + 2;
	    int prev = result;
        System.out.println("1 + 2 = " + result);

        result = result - 1;

        System.out.println("3 - 1 = " + result);

        System.out.println(prev);
        result = result + 10;
        System.out.println("result is now " + result);

        result = result % 3;
        System.out.println("12 mod 3 is " + result);
        result++;
        System.out.println(result);

        result -= 2;
        System.out.println(result);

        // result = result * 10
        result *= 10;
        System.out.println(result);

    }
}
