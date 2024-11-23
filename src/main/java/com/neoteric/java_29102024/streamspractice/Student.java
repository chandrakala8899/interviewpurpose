package com.neoteric.java_29102024.streamspractice;

import java.util.List;

public class Student {
    private String name;
    private List<Subject> subjects;

    // Constructor
    public Student(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

}
