package com.citi.example;

import com.citi.example.LinkedList.Node;

public class LinkedListTest {
    private static class Node {
        public int data;
        public Node next;
 
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
 
    private Node head= null;
 
   
 
    public void addToFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
 
    public boolean isCircular() {
        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
 
    public static void printList(LinkedListTest list) 
    { 
        Node currNode = list.head; 
     
        System.out.print("LinkedList: "); 
     
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
     
            // Go to next node 
            currNode = currNode.next; 
        } 
    } 
   
 
 
    public static void main(String[] args) {
        LinkedListTest list = new LinkedListTest();
        list.addToFront(1);
        list.addToFront(2);
        list.addToFront(3);
        list.addToFront(4);
        System.out.println(list.isCircular());  // Output: false
        list.printList(list);  // Output: false

    }
}