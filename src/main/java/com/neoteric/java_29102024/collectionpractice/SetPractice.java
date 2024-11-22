package com.neoteric.java_29102024.collectionpractice;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class SetPractice {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("chandu");
        set.add("Geetha");
        set.add("Sunitha");
        set.add("Mallesh");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        set.stream().forEach(s ->
                System.out.println(" using streams " + s.toString()));

       Set<String> filterednames  = set.stream().filter(s ->
          s.equals("Geetha")).collect(Collectors.toSet());
        System.out.println(" filtered names" + filterednames);


      set.stream().map(String::toUpperCase).forEach(
              System.out::println);
    }
}

