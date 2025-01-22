package com.test;

public class LinkedList {
	
	private Node head;
	private  int size =0;

	
	private class Node{
		
		private String data;
		private Node next;

		Node(String data){
            this.data = data;
            this.next = null;
            size ++;
     	}
	}		
	
	
	public void addFirst(String data) {
		
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(String data) {
		Node newNode = new Node(data);
	    if(head==null) {
	    	head= newNode;
	    	return;
	    }	
	    
	    Node pointer = head;
	    while(pointer.next!=null) {
	    	pointer = pointer.next;
	    }
	    
	    pointer.next = newNode;
	    
	    
	    
	}
	
	
	public void deleteFirst() {
		if(head == null) {
			return;
		}
		size --;
		head = head.next;
						
	}
	
	
	public void deleteLast() {
		if(head == null) {
			return;
		}
		
		size --;
		
		if(head.next==null) {
			head = null;
			return;
		}
		
		Node last = head;
		
		while(last.next.next!=null) {
			//last = last.next;
			last = last.next;
		}
		
		last.next = null;
				
	}
	
	public void display() {
		
		Node pointer = head;
		
		while(pointer != null) {
			System.out.println(pointer.data +" ");
			pointer = pointer.next;
		}
	}

	public static void main(String[] args) {
           LinkedList l = new LinkedList();
           l.addFirst("a");
           l.addFirst("is");
           l.addLast("list");

          // l.display();
       //    System.out.print(l.size);
 
         //  l.deleteFirst();
           l.display();

          // System.out.print(l.size);

           
           l.deleteLast();
           l.display();

           System.out.print(l.size);


	}

}
