package com.test;

public class CircularLinkedList {

	public static void main(String[] args) {
		CircularLinkedList c =new CircularLinkedList();
		c.addLast("65");          

		c.addFirst("22");
		c.addFirst("33");     
		c.addLast("57");          

		c.addFirst("44");    
		c.addLast("55");          
		
		c.display();
		c.deleteLastNode();
		System.out.println(" eeeee"+ c.size);
		
		c.display();
		System.out.println(" eeeee"+ c.size);

		c.deleteFirstNode();
		c.deleteFirstNode();

		System.out.println(" eeeee"+ c.size);

		c.display();



	}
	
	
	private Node last = null;
	private Node start = null;
	private int size=0;
	
	
	private class Node{
		private String data;
		private Node next;
		
		private Node(String data) {
			this.data =data;
		}
		
	}

	
	private void addFirst(String data) {
		//System.out.print(" "+ size);

		Node n = new Node(data);
		if(last==null) {
			n.next = n;
			last =n;
		}else {
			n.next = last.next;
			last.next =n;
		}
		
		size++;
		
 
	
	}
	
	
	
	private void deleteLastNode() {
		
		if(last==null) {
			return;
		}
		
		Node cur = last.next;
		while(cur.next !=last) {
			cur = cur.next;
		}
		
		cur.next = last.next;
		last = cur;
		size --;
	}
	
	
private void deleteFirstNode() {
		
		if(last==null) {
			return;
		}    
		
		Node first = last.next;
		last.next = first.next;
		size --;
	}
	
	private void addLast(String data) {
		
		Node n = new Node(data);
		
		if(last==null) {
			n.next = n;
			last =n;
		}else {
			n.next = last.next;
			last.next =n;
			
		}
		size ++;
		last =n;
	}
	
	
	private void display() {
		
		if(last==null) {
			return;
		}
		
		Node n = last.next;
		
		while(n!=last) {
			System.out.println(" "+n.data);
			 n = n.next;

		}
		
		if(n==last) {
			System.out.println(" "+n.data);
	
		}
		

		
	}

}



