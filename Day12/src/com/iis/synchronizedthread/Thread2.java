package com.iis.synchronizedthread;

public class Thread2 extends Thread{
  PrintTable obj;
  public Thread2(PrintTable obj) {
	  this.obj=obj;
  }
  public void run() {
	 obj.print(20); 
  }
}
