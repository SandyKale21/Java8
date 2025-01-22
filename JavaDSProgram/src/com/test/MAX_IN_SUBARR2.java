package com.test;

import java.util.ArrayList;
import java.util.List;

public class MAX_IN_SUBARR2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		List<Integer> max_list = new ArrayList<>();
		List<Integer> sum_list = new ArrayList<>();


		int nums[] = {1,3,-1,-3,5,3,6,7};
		
		System.out.print(" "+subArr(nums,3,0,max_list,3,sum_list,0));
	}
	
	
	public static List<Integer> subArr(int arr[], int k, int start,List<Integer> list, 
			int last,List<Integer> sumlist, int sum) {
		
		int new_arr[] = new int[k];
		int index =0;
		int max = 0;

		for(int j=start; j< last; j++) {
	          
	       
		     new_arr[index] = arr[j];
		     
		     if(new_arr[index] > max) {
		    	 max =  new_arr[index];
		     }
		     
		     if(last == k) {
		    	 sum = sum + new_arr[index];
		     }else {
		    	 sum = sum + arr[last-1] - arr[last-k-1];
		    	 break;
		     }
		     index = index +1;
		     
		}
		
		list.add(max);
		sumlist.add(sum);
		
		start = start + 1;
		last = start +k;
		if(last <=arr.length) {
		subArr(arr, k, start,list,last,sumlist,sum);
		}
		
		return sumlist;
	}

}
