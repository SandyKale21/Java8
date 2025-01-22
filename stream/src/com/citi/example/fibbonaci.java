package com.citi.example;

public class fibbonaci {
 
	int rem=0,res;
	public static void main(String[] args) {

		int num1=0, num2=1, num3;
		
		for(int i=2 ; i< 10;i++) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		//	System.out.print(", " + num3);
		}
		
		int number = 12345;
		
		fibbonaci f = new fibbonaci();
		System.out.println(f.reverse(number));
		
		
		  LinkedList list = new LinkedList(); 
		    
	        // 
	        // ******INSERTION****** 
	        // 
	    
	        // Insert the values 
	        list = list.insert(list, 1); 
	        list = list.insert(list, 2); 
	        list = list.insert(list, 3); 
	        list = list.insert(list, 4); 
	        list = list.insert(list, 5); 
	        list = list.insert(list, 6); 
	        list = list.insert(list, 7); 
	        list = list.insert(list, 8); 
	    
	        // Print the LinkedList 
	        list.printList(list); 
	   
		
	}
	
	public  int  reverse(int number) {
		rem = number % 10; 
		System.out.println(rem);

		res = res *10 + rem;   
		System.out.println(res);

		number = number/10; 
		if(number>0) {
			//System.out.println(number);

			reverse(number);
		}
		return res;
		
		
	}

}


 class LinkedList { 
    
    Node head; // head of list 
    
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
    
        int data; 
        Node next; 
    
        // Constructor 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
          
    
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
    
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
    
        // Return the list by head 
        return list; 
    } 
    
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
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
     
    // Driver code 
        /* Start with the empty list. */
       
}
