package com.neoteric.java_29102024.customlinkedlist;
public class CustomMap<K, V> {
    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next; // Point to the next node

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private final int SIZE = 16; // Initial size of the bucket array
    private Node<K, V>[] buckets; // Array of linked lists

    public CustomMap() {
        buckets = new Node[SIZE];
    }

    private int getBucketIndex(K key) {
        return (key.hashCode() & 0x7FFFFFFF) % SIZE;
    }

    // Method to add or update a key-value pair
    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        Node<K, V> newNode = new Node<>(key, value);

        if (buckets[bucketIndex] == null) {
            buckets[bucketIndex] = newNode; // Add the node if the bucket is empty
        } else {
            Node<K, V> current = buckets[bucketIndex];
            for (; current != null; ) {
                // Update the value if the key already exists
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                if (current.next == null) break; // Reach the end of the chain
                current = current.next;
            }
            current.next = newNode; // Add the new node to the chain
        }
    }


    public V get(K key) {                              // Method to retrieve a value by its key
        int bucketIndex = getBucketIndex(key);
        Node<K, V> current = buckets[bucketIndex];

        for (; current != null; ) {
            if (current.key.equals(key)) {
                return current.value; // Return the value if the key is found
            }
            current = current.next; // Move to the next node in the chain
        }
        return null; // Return null if the key is not found
    }

    // Method to remove a key-value pair by key
    public void remove(K key) {
        int bucketIndex = getBucketIndex(key);
        Node<K, V> current = buckets[bucketIndex];
        Node<K, V> previous = null;

        for (; current != null; ) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    buckets[bucketIndex] = current.next; // Remove the head node
                } else {
                    previous.next = current.next; // Remove the node in the chain
                }
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public void display() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Bucket " + i + ": ");
            Node<K, V> current = buckets[i];
            for (; current != null; ) {
                System.out.print("[" + current.key + "=" + current.value + "] -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
}





