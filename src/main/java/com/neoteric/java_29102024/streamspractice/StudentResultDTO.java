package com.neoteric.java_29102024.streamspractice;

public class StudentResultDTO {
    private String name;
    private String result;

    // Constructor
    public StudentResultDTO(String name, String result) {
        this.name = name;
        this.result = result;
    }

    @Override
    public String toString() {
        return "StudentResultDTO{name='" + name + "', result='" + result + "'}";
    }
}