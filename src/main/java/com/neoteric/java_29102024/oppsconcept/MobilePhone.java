package com.neoteric.java_29102024.oppsconcept;

public abstract class MobilePhone  implements  CallFunctionality,MessageFunctionality{
    protected String model;
    protected String brand;

    public MobilePhone(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }


    @Override
    public void makeCall(String phoneNumber) {
        System.out.println(brand + " " + model + " is calling " + phoneNumber);
    }

    // Default implementation for sending a text message
    @Override
    public void sendText(String phoneNumber, String message) {
        System.out.println(brand + " " + model + " sent a message to " + phoneNumber + ": " + message);
    }

    // Abstract method for any unique feature specific to each phone type
    public abstract void uniqueFeature();
}


