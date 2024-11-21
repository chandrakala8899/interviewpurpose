package com.neoteric.java_29102024.customlinkedlist;

class CustomLinkedList {

    static class Node {
        int data;     // Value of the node
        Node next;    // Pointer to the next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Head of the linked list

    // Add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, make the new node the head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the last node
            }
            current.next = newNode; // Link the last node to the new node
        }
    }

    // Remove a node with a specific value
    public void remove(int data) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        // If the head node is to be removed
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next; // Traverse to the node before the one to be removed
        }

        if (current.next == null) {
            System.out.println("Node with value " + data + " not found!");
        } else {
            current.next = current.next.next; // Bypass the node to be removed
        }
    }

    // Display the elements of the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        // Adding elements to the list
        list.add(10);
        list.add(20);
        list.add(30);

        // Display the list
        System.out.println("Original List:");
        list.display();

        // Removing an element
        list.remove(20);

        // Display the list after removal
        System.out.println("List after removing 20:");
        list.display();

        // Attempting to remove a non-existent element
        list.remove(40);
    }
}
