package com.test;

public class SumOfSubArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] ={1,2,3,1,2,6,1,2,4}; int k = 6;    
          int result = subarraySum(nums,k);
          System.out.println(result);
	}

	

	    public static int subarraySum(int[] nums, int k) {
	        
	        int count  =0;
	        int sum =0;
            int track=0;
	       
	        for(int i =0;i<nums.length;i++){
	          
	        	if(nums[i]==k) {
	        		count++;
	        		sum =0;
	        		i =track;
	        		track++;
	        		continue;
	        	}
	        	
	           sum = sum +nums[i];
	          
	           if(sum == k){
	              count++;
	              sum=0;
	              i=track;
	              track++;
	           }else if(sum>k){
	        	   track++;
	            sum =0;
	           }

	        }
	
	    return count;    
	    }

	
}
