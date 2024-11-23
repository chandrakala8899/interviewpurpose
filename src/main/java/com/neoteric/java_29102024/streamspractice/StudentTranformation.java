package com.neoteric.java_29102024.streamspractice;

import java.util.*;

public class StudentTranformation {
    public static void main(String[] args) {
        List<Subject> subjects = List.of(
                new Subject("Maths", 80),
                new Subject("Science", 70),
                new Subject("English", 50),
                new Subject("social", 40));

        Student student = new Student("Tharun", subjects,"1");

        StudentResultDTO studentResultDTO = student.getSubjects()
                .stream()
                .map(subject -> subject.getMarks() < 35 ? "Fail" : "Pass")
                .reduce((result1, result2) -> result1.equals("Fail") || result2.equals("Fail") ? "Fail" : "Pass") // Reduce to determine the final result
                .map(result -> new StudentResultDTO(student.getName(), result))
                .orElse(new StudentResultDTO(student.getName(), "Pass"));
                System.out.println(studentResultDTO);   //  transformed result


     // how flatmap works

        Map<List<Subject>,String> studentsmap = new HashMap<>();
         Subject telugu = new Subject("Telugu",70);
        Subject english = new Subject("English",70);
        Subject maths = new Subject("Maths",70);
        Subject social = new Subject("Social",70);

        studentsmap.put(Arrays.asList(telugu,english,maths,social),"chandu");
        studentsmap.put(Arrays.asList(telugu,english,maths,social),"Geetha");
        studentsmap.put(Arrays.asList(telugu,english,maths,social),"Seetha");
        studentsmap.put(Arrays.asList(telugu,english,maths,social),"Mahi");

        List<String> allSubjects = studentsmap.entrySet()
                       .stream().flatMap(entry -> entry.getKey().stream())  // Flatten each student's list of subjects
                       .map(Subject::getName).distinct().toList();
           System.out.println(" using flatMap " + allSubjects);



    }

}
