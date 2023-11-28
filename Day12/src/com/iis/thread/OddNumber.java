package com.iis.thread;

public class OddNumber extends Thread {
	   public void run() {
		   for(int i=0;i<=50;i++) {
			   if(i%2!=0) {
				   System.out.println("The Odd Number is "+i);
			   }
		   }
	   }

}
