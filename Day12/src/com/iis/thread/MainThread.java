package com.iis.thread;

public class MainThread extends Thread
{
	public void run() {
   if(Thread.currentThread().getName().equals("EvenThread")) {
        System.out.println("Even Thread is working");
	   for(int i=0;i<=20;i++) {
		   if(i%2==0) {
		   System.out.println("The Even Number is "+i);
	   }
	   }
   }
   else if(Thread.currentThread().getName().equals("OddThread")) {
	   
	   for(int z=0;z<=20;z++) {
		   if(z%2!=0) {
			   System.out.println("The Odd number is "+z);
		   }
	   }
   }
	}
}
	
