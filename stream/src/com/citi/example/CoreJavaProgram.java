package com.citi.example;

public class CoreJavaProgram {
	
//	static int x =5;
	
	Thread t =  new Thread();
	public static void main(String args[]) {
		boolean flag = true;
		int num =999999999;
		int sum =0,reminder=0;
		while(num>0) {
			reminder =num%10;
			sum = sum + reminder;
			num = num/10;  
			System.out.println(num);
			//System.out.println(reminder);

			if(num ==0 && flag) {
				System.out.print("sum");

				System.out.println(sum);
				num = sum;
				sum =0;
				flag = false;
			}
			
			
		}
		
		System.out.println(sum);
		
		
		for(int x=5;x<10;x++) {
		//	System.out.print(x);
		//	x--;
		}
		
		//c.test();
		
		String str ="chetan @gmail.com chtyu";
		System.out.println(str.contains("@gmail.com"));
	}
	
	
}





	