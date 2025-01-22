package com.citi.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test{

	public static void main(String[] args) {
        PrintSequenceRunnable runnable1=new PrintSequenceRunnable(0);
        PrintSequenceRunnable runnable2=new PrintSequenceRunnable(1);
      //  PrintSequenceRunnable runnable3=new PrintSequenceRunnable();
 
        Thread t1=new Thread(runnable1,"T1");
        Thread t2=new Thread(runnable2,"T2");
   //     Thread t3=new Thread(runnable3,"T3");
 
        t1.start();
        t2.start();
   //     t3.start();  

	}

}
 class PrintSequenceRunnable implements Runnable{
	 
    public int PRINT_NUMBERS_UPTO=10;
    static int  number=1;
    int remainder;
    static Object lock=new Object();
 
    PrintSequenceRunnable(int remainder)
    {
    	this.remainder = remainder;
    }
 
    @Override
    public void run() {
        while (number < PRINT_NUMBERS_UPTO-1) {
            synchronized (lock) {
                while (number % 2 != remainder) { // wait for numbers other than remainder
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();
            }
        }
    }
}


