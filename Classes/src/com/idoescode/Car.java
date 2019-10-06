package com.idoescode;

public class Car {
    // State component
    // with 5 fields
    private int doors;
    private  int wheels;
    private String model;
    private  String engine;
    private String colours;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        // you can't == strings :( have to use equals
        if (validModel.equals("carrera") || validModel.equals("comodore")) {
            this.model = model;
        } else {
            throw new Error("Wrong model");
        }

    }

    public String getModel() {
        return this.model;
    }

}
