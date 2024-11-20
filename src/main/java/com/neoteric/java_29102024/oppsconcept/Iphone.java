package com.neoteric.java_29102024.oppsconcept;

public class Iphone  extends MobilePhone implements CameraFunctionality{

    public Iphone(String model) {
        super(model, "iPhone");
    }

    @Override
    public void takePhoto() {
        System.out.println(brand + " " + model + " is taking a photo with its advanced camera.");
    }

    @Override
    public void uniqueFeature() {
        System.out.println(brand + " " + model + " has FaceID for secure authentication.");
    }
}


