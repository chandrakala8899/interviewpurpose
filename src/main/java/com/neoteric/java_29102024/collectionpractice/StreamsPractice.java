package com.neoteric.java_29102024.collectionpractice;

import java.util.*;

public class StreamsPractice {
    public static void main(String[] args) {

        Map<String, Integer> marks = new HashMap<>();
        marks.put("Telugu", 70);
        marks.put("English", 80);
        marks.put("Hindi", 35);
        marks.put("Maths", 80);
        marks.put("Science", 70);
        marks.put("Social", 60);

        EnumMap<StreamsResult,List<String>> categorizedSubjects = new EnumMap<>(StreamsResult.class);

                List<String> passSubjects = marks.entrySet()
                        .stream()
                        .map(entry -> entry.getValue() > 35 ? entry.getKey() : null)
                        .toList();


                List<String> failSubjects = marks.entrySet()
                        .stream()
                        .map(entry -> entry.getValue() <= 35 ? entry.getKey() : null)
                        .toList();

                categorizedSubjects.put(StreamsResult.PASS, passSubjects);
                categorizedSubjects.put(StreamsResult.FAIL, failSubjects);

                System.out.println("Pass Subjects: " + categorizedSubjects.get(StreamsResult.PASS));
                System.out.println("Fail Subjects: " + categorizedSubjects.get(StreamsResult.FAIL));

                // use filters
         Long  passSubjectsCount = marks.entrySet().stream().filter(entry -> entry.getValue() > 35).count();
         Long failSubjcetCount =  marks.entrySet().stream().filter(entry -> entry.getValue() <= 35).count();

         System.out.println(passSubjectsCount);
         System.out.println(failSubjcetCount);

            }

}
