package com.citi.example;

import java.util.PriorityQueue;

public class StringRotation {

	public static  void leftRotate(String str,int d) {
	//	System.out.println(str.substring(d));
		int e = str.length()-d;
		System.out.println( str.substring(e) +str.substring(0,e));

		
	}
	    // Driver code
    public static void main(String args[])
    {
                 String str2 = "abcd";
      
                 for(int i=0;i<=str2.length()-1;i++) {
          leftRotate(str2, i);
                 }
                 

    }
}

