package com.idoescode;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ITelephone timsPhone;

        timsPhone = new DeskPhone();


        timsPhone.powerOn();

        GearBox mcLaren = new GearBox(2);
        // inner class - it would throw without mcLaren being initiated
        GearBox.Gear first = mcLaren.new Gear(1, 12.34);
        // throws
        // GearBox.Gear second = new GearBox.Gear(1, 23.42);


        Dog doggie = new Dog("Kelpie");

        doggie.eat();

    }
}
