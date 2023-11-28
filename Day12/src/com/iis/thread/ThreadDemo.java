package com.iis.thread;

public class ThreadDemo extends Thread
{
   public void run() {
	   for(int x=0;x<10;x++)
	   {
		   System.out.println("The Value is "+x);
		   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
   }
   public static void main(String[] args) {
	ThreadDemo td=new ThreadDemo();
	AnotherThread at=new AnotherThread();
	td.start();
	at.start();
}
}
