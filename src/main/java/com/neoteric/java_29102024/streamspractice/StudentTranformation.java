package com.neoteric.java_29102024.streamspractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StudentTranformation {
    public static void main(String[] args) {
        List<Subject> subjects = List.of(
                new Subject("Maths", 80),
                new Subject("Science", 70),
                new Subject("English", 40),
                new Subject("social", 20));

        Student student = new Student("Tharun", subjects);

        StudentResultDTO studentResultDTO = student.getSubjects()
                .stream()
                .map(subject -> subject.getMarks() < 35 ? "Fail" : "Pass")
                .reduce((result1, result2) -> result1.equals("Fail") || result2.equals("Fail") ? "Fail" : "Pass") // Reduce to determine the final result
                .map(result -> new StudentResultDTO(student.getName(), result))
                .orElse(new StudentResultDTO(student.getName(), "Pass"));
                System.out.println(studentResultDTO);   //  transformed result

    }
}
