package com.test;

import java.util.ArrayList;
import java.util.List;

public class MAX_IN_SUBARR {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		List<Integer> max_list = new ArrayList<>();
		List<Integer> sum_list = new ArrayList<>();


		int nums[] = {1,3,-1,-3,5,3,6,7};
		
		System.out.print(" "+subArr(nums,3,0,max_list,3,sum_list));
	}
	
	
	public static List<Integer> subArr(int arr[], int k, int start,List<Integer> list, int last,List<Integer> sumlist) {
		
		int new_arr[] = new int[k];
		int index =0;

		for(int j=start; j< last; j++) {
		
		     new_arr[index] = arr[j];
		     index = index +1;
		     
		}
		
		
		start = start + 1;
		
		list = maxInSubArr(new_arr,list);
		sumlist = sumOfSubArr(new_arr,sumlist);


		last = start +k;
		if(last <=arr.length) {
		subArr(arr, k, start,list,last,sumlist);
		}
		
		return sumlist;
	}
	
	
	public static List<Integer> maxInSubArr(int new_arr[],List<Integer> list) {
		
		int max =0;
		
		for(int k=0;k<new_arr.length;k++) {
			
			if(new_arr[k]>max) {
				max = new_arr[k];
			}
		}
		
		list.add(max);
		
		return list;
	}
	
	
	
public static List<Integer> sumOfSubArr(int new_arr[],List<Integer> list) {
		
		int sum =0;
		
		for(int k=0;k<new_arr.length;k++) {
			sum = sum + new_arr[k];
		}
		
		list.add(sum);
		
		return list;
	}


}
