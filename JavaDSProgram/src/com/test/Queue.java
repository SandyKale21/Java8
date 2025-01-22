package com.test;

public class Queue {

	private Node start;
	private Node end;
	 int length =0;
	
	
	public void add(String data) {
		Node value = new Node(data);
		
		if(length==0) {
		     start = value;	
		}else {
			end.next = value;
		}
		
		end = value;
		length ++;
	}
	
   public void display() {
	   Node current = start;
	   
	   while(current!=null) {
		   System.out.println (" data is --> " +current.data);
		   current = current.next;
	   }
	   
   }	
   
   public String delete() {
	   if(length==0) {
		   return null;
	   }
	   
	   String result = start.data;
	   start = start.next;
	   
	   if(start==null) {
		   end = null;
	   }
	   length --;
	   
	   return result;
	   	   
   }

private class Node{
	private String data;
	private Node next;
	private Node(String data) {
		this.data=data;
		this.next =null;
	}
}

public static void main(String[] args) {
	 Queue q = new Queue();
	 q.add("1");
	 q.add("2");
	 q.add("3");
	 
         q.display();
		   System.out.println(" data is yyy --> " +q.delete() +" len   " +q.length);
		   System.out.println(" data isb jj --> " +q.delete() +" len   " +q.length);
		   System.out.println(" data is hhhh--> " +q.delete() +" len   " +q.length);

}

}

