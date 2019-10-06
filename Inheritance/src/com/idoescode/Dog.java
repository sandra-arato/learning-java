package com.idoescode;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.teeth = teeth;
        this.coat = coat;
        this.tail = tail;
    }

    private void chew() {
        System.out.println("Dog chews on bone");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat called");
        chew();
        super.eat();
    }
}
