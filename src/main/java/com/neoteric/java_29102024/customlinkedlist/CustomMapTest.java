package com.neoteric.java_29102024.customlinkedlist;

public class CustomMapTest {
    public static void main(String[] args) {
        CustomMap<Integer, String> map = new CustomMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(17, "Cherry");   // Will cause a collision with key 1 if SIZE = 16

        // Display the map
        System.out.println("Initial Map:");
        map.display();


        System.out.println("Value for key 2: " + map.get(2));    // Retrieving a value


        map.put(2, "Blueberry");   // Updating a value
        System.out.println("Map after updating key 2:");
        map.display();


        map.remove(17);    // Removing a key
        System.out.println("Map after removing key 17:");
        map.display();
    }
}



