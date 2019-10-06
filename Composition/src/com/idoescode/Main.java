package com.idoescode;

public class Main {

    public static void main(String[] args) {
        Dimensions dims = new Dimensions(123, 1234, 32);
        Case theCase = new Case(
                "22011",
                "Dell",
                "240", dims);

        Monitor monitor = new Monitor(
                "24inch Beast",
                "Acer",
                23,
                new Resolution(1600, 1200)
        );

        Motherboard motherboard = new Motherboard(
                "ABC-123",
                "Asus",
                4,
                6,
                "v7"
        );

        PC thePC = new PC(theCase, monitor, motherboard);

        // get started
//
//        thePC.getTheCase().pressPowerButton();
//
//        thePC.getMotherboard().loadProgram("OSX");

        thePC.start();
    }
}
