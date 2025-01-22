package com.test;

import java.util.ArrayList;
import java.util.List;

public class MAX_IN_SUBARR3 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		List<Integer> max_list = new ArrayList<>();
		List<Integer> sum_list = new ArrayList<>();


		int nums[] = {1,3,-1,-3,5,3,6,7};
		
		for(int k=1;k<nums.length;k++) {
			subArr(nums,k,0,0);
		}
	}
	
	
	public static void subArr(int arr[], int k, int start, 
			int last) {
		
		int new_arr[] = new int[k];
		int index =0;
		int max = 0;

		for(int j=start; j< last; j++) {
	          
	       
		     new_arr[index] = arr[j];
		     index = index +1;
		     
		}
		
		System.out.println(" new arrr ");
		
		for(int m= 0;m<new_arr.length;m++) {
			System.out.print(" " +new_arr[m]);
		}
		
		System.out.println("  ");

		start = start + 1;
		last = start +k;
		if(last <=arr.length) {
		subArr(arr, k, start,last);
		}
		
		
	}

}
