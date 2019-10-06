package com.idoescode;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution; // this is composition. Monitor __has__ Resolution

    public Monitor(String model, String manufacturer, int size, Resolution resolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + " in colour "+ color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getResolution() {
        return nativeResolution;
    }
}
