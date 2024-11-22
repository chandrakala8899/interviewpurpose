package com.neoteric.java_29102024.collectionpractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetPractice {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(TreeSetPractice.class);

        TreeSet<String> employeeNames = new TreeSet<>();
        employeeNames.add("geetha");
        employeeNames.add("chandu");
        employeeNames.add("seetha");
        employeeNames.add("avinash");
        employeeNames.add("bhagi");
        employeeNames.add("mahi");

        logger.info("Employees sorted by name:");
        employeeNames.stream()
                .forEach(System.out::println);

        Iterator<String> itr = employeeNames.iterator();
        while (itr.hasNext()){
         String response = itr.next();
         logger.info(" retrieve data using iterator:   " + response);
        }

        
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(40);
        treeSet.add(5);
        treeSet.add(20);

         logger.info(" Elements greater then 10");
        treeSet.stream().filter(num ->
                num>10).forEach(System.out::println);

     var evenNumbers =  treeSet.stream()
             .filter(num -> num % 2==0)
             .collect(Collectors.toSet());
     logger.info("even Numbers" + evenNumbers);


        TreeSet<Integer> treeSet1 = new TreeSet<>(Comparator.reverseOrder());
        treeSet1.add(10);
        treeSet1.add(40);
        treeSet1.add(5);
        treeSet1.add(20);
       logger.info(" Reverse order " + treeSet1);


    }
}
