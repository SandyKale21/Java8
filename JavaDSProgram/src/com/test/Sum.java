package com.test;

public class Sum {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread t1 =new Thread(new Cal());
		Thread t2 =new Thread(new Cal());
		Thread t3 =new Thread(new Cal());
		Thread t4 =new Thread(new Cal());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		int result =0;
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		
		for(int i=0; i<4;i++) {
			result = result + sum_arr[i];
		}
		
		System.out.println(result);

	}
	
	private static int index =0;
	private static int sum_arr[] = new int[4];


	static class Cal implements Runnable{

		
		@Override
		public void run() {
			
			int start = index++;
	
			int sum =0;
			
			for(int i = start*10; i<(start+1)*10;i++) {
				System.out.println(Thread.currentThread().getName());

		//	System.out.println(i);

				sum = sum + i;
			}
			
		//	System.out.println(Thread.currentThread().getName());

			//System.out.println(sum);

			sum_arr[start] =sum;
			
			// TODO Auto-generated method stub
			
		}
		
	}

}


