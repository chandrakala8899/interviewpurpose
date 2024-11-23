package com.neoteric.java_29102024.streamspractice;

import java.util.List;

public class Student {
    private String name;

    private  String id;

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    private List<Subject> subjects;

    // Constructor
    public Student(String name, List<Subject> subjects ,String id) {
        this.name = name;
        this.subjects = subjects;
        this.id= id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

}
