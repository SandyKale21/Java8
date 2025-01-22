package com.test;

import java.util.HashSet;
import java.util.Set;

public class JavaProgram {

	public static void main(String[] args) {

		int arr[] = {1, 2, 4,4};
		int k =2;
		sub_arr(arr,k,0,k);

	}

	public static void sub_arr(int arr[], int k, int start,int size) {
		
		int sub[] = new int[size];
		int index =0;
		
		for(int i = start;i<k;i++) {         
                sub[index]= arr[i];
        		System.out.print("  "+sub[index]);

                index++;

	     	}
		
		System.out.println("  ");

		distinct(sub);
		start = start +1;
		k= k+1;
		
		if(k<=arr.length) {

		sub_arr(arr,k,start,size);
		}
		
	}
	
	
	public static void distinct(int new_arr[]) {
		
		Set set = new HashSet();
		
		int size =0;
		
		for(int i=0;i<new_arr.length;i++) {
			if(!set.contains(new_arr[i])) {
			      set.add(new_arr[i]);
					size = size +1;;


			}
			
		}
		System.out.println(size);


		}
		
	}
	
	

