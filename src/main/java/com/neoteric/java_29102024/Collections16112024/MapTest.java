package com.neoteric.java_29102024.Collections16112024;

import java.util.HashMap;
import java.util.LinkedList;

public class MapTest {
    public static void main(String[] args) {

        HashMap<linkedDifferHashMap, String> map = new HashMap();
        linkedDifferHashMap linkedDifferHashMap1 = new linkedDifferHashMap("chandu", 20);
        linkedDifferHashMap linkedDifferHashMap2 = new linkedDifferHashMap("Geetha", 25);
        linkedDifferHashMap linkedDifferHashMap3 = new linkedDifferHashMap("chandu", 20);

        map.put(linkedDifferHashMap1, "doctor");
        map.put(linkedDifferHashMap2, "Engineer");
        map.put(linkedDifferHashMap3, "police");

        System.out.println(linkedDifferHashMap1.getName()+ " Hashmap hashcode" );
        System.out.println(map.size());
        map.forEach((key, value) -> System.out.println(key + " => " + value));
        System.out.println(map.get(linkedDifferHashMap1));

        LinkedList<linkedDifferHashMap> linkedList = new LinkedList();

        linkedList.add(linkedDifferHashMap1);
        linkedList.add(linkedDifferHashMap2);
        linkedList.add(linkedDifferHashMap3);

        String s1 = new String("chandu");
        String s3 = "chandu";
        String s2 = new String("geetha");

        System.out.println(s1.hashCode() + "   "+s2.hashCode());
        System.out.println(s1.equals(s3));  // compare inside data it will
        System.out.println(s1==s3);   // compare references


        System.out.println(linkedDifferHashMap1.getName()+" LinkedListHashcode hashcode");
        System.out.println(linkedList.size());

        linkedList.forEach(linkedDifferHashMap ->
                System.out.println(linkedDifferHashMap+ "  " +linkedDifferHashMap.hashCode()));

    }
}

