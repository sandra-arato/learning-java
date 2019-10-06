package com.idoescode;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private double weight;

    public Animal(String name, int brain, int body, int size, double weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public void eat() {
        System.out.println("Animal eat called");

        this.weight = this.weight * 1.02;
    }
}
