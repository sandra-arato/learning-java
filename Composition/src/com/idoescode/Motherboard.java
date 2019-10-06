package com.idoescode;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int romSlots = 2; // default value
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int romSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.romSlots = romSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public Motherboard(String model, String manufacturer, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.cardSlots = cardSlots;
        this.bios = bios;

        /// still sets romSlot based on default at top
    }

    public void loadProgram(String program) {
        System.out.println("Program " + program + " is now loading");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRomSlots() {
        return romSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
