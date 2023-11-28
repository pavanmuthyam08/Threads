package com.iis.thread;

public class EvenNumber extends Thread {
   public void run() {
	   for(int i=0;i<=50;i++) {
		   if(i%2==0) {
			   System.out.println("The Even Number is "+i);
		   }
	   }
   }
}
