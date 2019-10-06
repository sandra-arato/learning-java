package com.idoescode;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        // porsche = null;
        // if you don't initialise,
        // you get NullPointerException;
        // eg. porsche is undefined
        porsche.setModel("Carrera");
        System.out.println(porsche.getModel());

        // this will throw an error
        // wrong model
//        porsche.setModel("911");

        BankAccount bobsAccount = new BankAccount("12345", 0, "Bob");

        BankAccount jennysAccount = new BankAccount("Jenny");
    }
}
