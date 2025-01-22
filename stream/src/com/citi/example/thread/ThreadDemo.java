package com.citi.example.thread;

public class ThreadDemo{

	public static void main(String[] args) {
		ChildThread t = new ChildThread();
		t.start();
		t.start();

		//t.run();

		System.out.println(Thread.currentThread().getName());

	}
	
}


class  ChildThread  extends Thread{
	
	public void start() {
super.start();
System.out.println("start " +Thread.currentThread().getName());
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public void run(String s) {
		System.out.println(s + Thread.currentThread().getName());
	}

	// if you dont overriding run method thread class run method executed which has no implementation
	//point is why u need to crreate thread
}