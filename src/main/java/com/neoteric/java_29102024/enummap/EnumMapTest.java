package com.neoteric.java_29102024.enummap;

import java.util.EnumMap;


public class EnumMapTest {
    public static void main(String[] args) {

        EnumMap<AttendenceStatus,String> enumMap = new EnumMap<>(AttendenceStatus.class);
        enumMap.put(AttendenceStatus.PRESENT,"Employees marked as Present");
        enumMap.put(AttendenceStatus.ABSENT," No data for absentees yet");
        enumMap.put(AttendenceStatus.ON_LEAVE,"Employees on Leave.");

        enumMap.entrySet().stream().forEach(entry ->
                System.out.println(entry.getKey() + "  value: " + entry.getValue())
        );

       enumMap.entrySet().stream().filter(entry ->
         entry.getKey() !=AttendenceStatus.ABSENT)
         .forEach(entry -> System.out.println(entry.getKey() + " from filter  :" + entry.getValue())
         );
    }
}
