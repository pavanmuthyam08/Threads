package com.iis.thread;

public class FirstRunnable  implements Runnable
{
  public void run() {
	  for(int x=0;x<=30;x++) {
		  if(x%2==0) {
			  System.out.println("The Even Number is "+x);
			  try {
				Thread.sleep(100);
			} 
			  catch (InterruptedException e) {
	          System.out.println("Thread Interrupt Occured");
			}
		  }
	  }
  }
  public static void main(String[] args) {
	FirstRunnable fr=new FirstRunnable();
	Thread t1=new Thread(fr);
	t1.start();
	FirstRunnable fr2=new FirstRunnable();
	Thread t2=new Thread(fr2);
	t2.start();
}
}
