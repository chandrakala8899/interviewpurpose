package com.neoteric.java_29102024.oppsconcept;

public class Android extends MobilePhone implements CameraFunctionality {


    public Android(String model) {
        super(model, "Android");
    }

    @Override
    public void takePhoto() {
        System.out.println(brand + " " + model + " is taking a photo with its high-quality camera.");
    }

    @Override
    public void uniqueFeature() {
        System.out.println(brand + " " + model + " has Google Assistant for voice commands.");
    }
}
