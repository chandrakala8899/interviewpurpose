package com.neoteric.java_29102024.oppsconcept;

public class PolymorphismTest {
    public static void main(String[] args) {
        MobilePhone iphone = new Iphone("12 Pro");
        MobilePhone android = new Android("Galaxy S21");

        iphone.makeCall("7890");
        iphone.sendText("7890", "Hello from iPhone!");
        ((CameraFunctionality) iphone).takePhoto();
        iphone.uniqueFeature();

        android.makeCall("4321");
        android.sendText("4321", "Hello from Android!");
        ((CameraFunctionality) android).takePhoto();
        android.uniqueFeature();
    }
}
